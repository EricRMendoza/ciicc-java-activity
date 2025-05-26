package GcashApp;

import java.util.Scanner;

// Make sure UserAuthentication is imported if it's in another file
// import GcashApp.UserAuthentication;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection.initializeDatabase();
        UserAuthentication auth = new UserAuthentication();
        Scanner sc = new Scanner(System.in);
        int userId = -1;

        while (true) {
            System.out.println("\n1. Register\n2. Login\n3. Change PIN\n4. Logout\n5. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine(); // flush newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    System.out.print("Number: ");
                    String number = sc.nextLine();
                    System.out.print("PIN (4-digit): ");
                    String pin = sc.nextLine();

                    if (auth.registerUser(name, email, number, pin))
                        System.out.println("Registration successful.");
                }
                case 2 -> {
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    System.out.print("PIN: ");
                    String pin = sc.nextLine();

                    userId = auth.login(email, pin);
                    if (userId != -1)
                        System.out.println("Login successful. User ID: " + userId);
                    else
                        System.out.println("Login failed. Check credentials.");
                }
                case 3 -> {
                    if (userId == -1) {
                        System.out.println("Please log in first.");
                        continue;
                    }
                    System.out.print("Old PIN: ");
                    String oldPin = sc.nextLine();
                    System.out.print("New PIN: ");
                    String newPin = sc.nextLine();
                    if (auth.changePin(userId, oldPin, newPin))
                        System.out.println("PIN changed successfully.");
                    else
                        System.out.println("Failed to change PIN.");
                }
                case 4 -> {
                    auth.logout();
                    userId = -1;
                }
                case 5 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}