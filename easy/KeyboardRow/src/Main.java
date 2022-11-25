import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] words = {"omk"};
        System.out.println(Arrays.toString(findWords(words)));
    }

    public static String[] findWords(String[] words) {
        StringBuilder r = new StringBuilder();
        for (String w : words) {
            if (w.matches("[qwertyuiopQWERTYUIOP]+") ||
                w.matches("[asdfghjklASDFGHJKL]+") ||
                w.matches("[zxcvbnmZXCVBNM]+")) {
                r.append(w).append("-");
            }
        }
        return r.length() == 0 ? new String[0] : r.toString().split("-");
    }
}