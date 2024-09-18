public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println(longestPalindrome("babad"));
    }

    public static String longestPalindrome(String str) {

        String result = "";
        StringBuilder reverseString = new StringBuilder("");
        int length = str.length();
        String[] tes = {};

//        for (int index = 0; index < length/2; index++) {
//            if (str.charAt(index) != str.charAt(length-index-1)) {
//                result = "Not palindrome";
//            }
//        }

//        for (int index = length-1; index >= 0; index--) {
//             reverseString.append(str.charAt(index));
//        }

        for (int index = 0; index < length; index++) {
            if (str.charAt(index) == str.charAt(index + 1)) {

            }
        }

        result = (reverseString.toString().trim().equals(str)) ? "Palindrome" : "Not palindrome";

        return result;
    }
}