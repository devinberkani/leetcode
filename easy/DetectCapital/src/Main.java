public class Main {
    public static void main(String[] args) {
        System.out.println(detectCapitalUse("a"));
    }

    public static boolean detectCapitalUse(String word) {
        return word.matches("[A-Z]+") || word.matches("[a-z]+") || word.matches("[A-Z][a-z]+");
    }
}