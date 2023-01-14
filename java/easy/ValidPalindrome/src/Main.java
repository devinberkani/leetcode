public class Main {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        s = s.replaceAll("\\W", "").replaceAll("_", "");
        return s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());
    }
}