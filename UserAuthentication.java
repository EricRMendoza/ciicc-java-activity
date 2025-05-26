package GcashApp;

import java.security.*;
import java.sql.*;
import java.util.regex.*;

public class UserAuthentication {

    public boolean registerUser(String name, String email, String number, String pin) {
        if (!validateFields(name, email, number, pin))
            return false;

        try (Connection conn = DatabaseConnection.connect()) {
            String sql = "INSERT INTO users(name, email, number, pin) VALUES(?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.setString(3, number);
            pstmt.setString(4, hashPin(pin));
            pstmt.executeUpdate();
            return true;
        } catch (SQLException | NoSuchAlgorithmException e) {
            System.out.println("Registration error: " + e.getMessage());
            return false;
        }
    }

    public int login(String email, String pin) {
        String hashedPin;
        try {
            hashedPin = hashPin(pin);
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Hashing error.");
            return -1;
        }

        try (Connection conn = DatabaseConnection.connect()) {
            String sql = "SELECT id FROM users WHERE email = ? AND pin = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, email);
            pstmt.setString(2, hashedPin);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next())
                return rs.getInt("id");
            else
                return -1;
        } catch (SQLException e) {
            System.out.println("Login error: " + e.getMessage());
            return -1;
        }
    }

    public boolean changePin(int userId, String oldPin, String newPin) {
        try (Connection conn = DatabaseConnection.connect()) {
            String sqlCheck = "SELECT pin FROM users WHERE id = ?";
            PreparedStatement checkStmt = conn.prepareStatement(sqlCheck);
            checkStmt.setInt(1, userId);
            ResultSet rs = checkStmt.executeQuery();

            if (rs.next() && rs.getString("pin").equals(hashPin(oldPin))) {
                String sqlUpdate = "UPDATE users SET pin = ? WHERE id = ?";
                PreparedStatement updateStmt = conn.prepareStatement(sqlUpdate);
                updateStmt.setString(1, hashPin(newPin));
                updateStmt.setInt(2, userId);
                updateStmt.executeUpdate();
                return true;
            } else {
                return false;
            }
        } catch (SQLException | NoSuchAlgorithmException e) {
            System.out.println("Change PIN error: " + e.getMessage());
            return false;
        }
    }

    public void logout() {
        System.out.println("User logged out.");
    }

    private boolean validateFields(String name, String email, String number, String pin) {
        if (name.isBlank() || !email.matches("^\\S+@\\S+\\.\\S+$") ||
                !number.matches("\\d{11}") || !pin.matches("\\d{4}")) {
            System.out.println("Validation failed.");
            return false;
        }
        return true;
    }

    private String hashPin(String pin) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = md.digest(pin.getBytes());
        StringBuilder sb = new StringBuilder();
        for (byte b : hashBytes)
            sb.append(String.format("%02x", b));
        return sb.toString();
    }
}