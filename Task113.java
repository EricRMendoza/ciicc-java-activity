ublic class Task113 {
    public static void main(String[] args) {
        int check_number = 10;
        
        for (int i = 1; i <= check_number; i++) {
            String message = (i % 2 == 0) ? "It is an even number" : "It is an odd number";
            System.out.println(i + ": " + message);
        }
    }
}
