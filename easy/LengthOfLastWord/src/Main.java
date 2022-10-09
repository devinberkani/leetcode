public class Main {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        return s.split("\\s")[s.split("\\s").length - 1].length();
    }
}