public class Main {
    public static void main(String[] args) {
        System.out.println(reverseWords("God Ding"));
    }

    public static String reverseWords(String s) {
        s = new StringBuilder(s).reverse().toString();
        StringBuilder r = new StringBuilder();
        for (int i = s.split(" ").length - 1; i >= 0; i--) {
            r.append(s.split(" ")[i]);
            if (i != 0) r.append(" ");
        }
        return r.toString();
    }
}