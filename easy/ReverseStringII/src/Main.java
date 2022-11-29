public class Main {
    public static void main(String[] args) {
        System.out.println(reverseStr("a", 1));
    }

    public static String reverseStr(String s, int k) {

        for (int i = 0; i < s.length(); i += k * 2) {
            String b = s.substring(i, Math.min(i + k, s.length()));
            s = s.replaceFirst(b, new StringBuilder(b).reverse().toString());
        }
        return s;
    }
}