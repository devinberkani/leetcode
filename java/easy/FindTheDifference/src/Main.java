import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(findTheDifference("", "y"));
    }

    public static char findTheDifference(String s, String t) {
        char[] ss = s.toCharArray();
        char[] ts = t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(ts);
        for (int i = 0; i < s.length(); i++) {
            if (ss[i] != ts[i]) {
                    return ts[i];
            }
        }
        return ts[ts.length - 1];
    }
}