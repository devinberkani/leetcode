public class Main {
    public static void main(String[] args) {
        System.out.println();
    }

    public boolean isPalindrome(int x) {
        String xString = Integer.toString(x);
        StringBuilder xStringBuilder = new StringBuilder(Integer.toString(x)).reverse();
        String xStringReversed = xStringBuilder.toString();
        return xString.equals(xStringReversed);
    }
}