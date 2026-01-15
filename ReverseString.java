public class ReverseString {

    public static void main(String[] args) {
        String str = "madam";
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        // Checking if the string is palindrom or not
        if (str.equals(rev)) {
            System.out.println("The string is palindrom");
        } else {
            System.out.println("The string is not palindrom");
        }
        System.out.println(rev);
    }
}
