package lesson3HW;

public class lesson3Task6 {
    public static void main(String[] args) {
        String str = "madam";

        boolean isPalindrome = true;

        for (int i = 0, j = str.length()-1; i < str.length()/2; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome) System.out.println("The word: '" + str + "' is Palindrome");
        else System.out.println("The word: " + str + "is not Palindrome");
    }
}
