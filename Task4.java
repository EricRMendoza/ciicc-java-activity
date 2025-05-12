public class Task4 {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("anak nasanan kana");
        System.out.println("String = " + str.toString());
          
        String original = str.toString();
           
        str.reverse();
        System.out.println("Reverse String = " + str.toString());
          
        if (original.equals(str.toString())) {
            System.out.println("The input string is a palindrome");
        } else {
            System.out.println("The input string is not a palindrome");
        }
    }
}
