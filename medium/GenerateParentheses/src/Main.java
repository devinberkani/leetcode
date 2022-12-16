import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> n = generateParenthesis(5);
        List<String> o = generateParenthesisO(5);
        Collections.sort(n);
        Collections.sort(o);
        System.out.println(n);
        System.out.println(o);
    }

    public static List<String> generateParenthesis(int n) {
        List<String> r = new ArrayList<>();
        if (n == 1) {
            r.add("()");
            return r;
        }
        r.add("(())");
        r.add("()()");
        for (int j = 2; j < n; j++) {
            List<String> current = new ArrayList<>();
            for (String s : r) {
                for (int l = 0; l <= (s.length() / 2); l++) {
                    StringBuilder c = new StringBuilder(s).insert(l, "()");
                    if (!current.contains(c.toString())) current.add(c.toString());
                    if (j == n - 1) {
                        String reverse = c.reverse().toString().replaceAll("\\(", "|").replaceAll("\\)", "(").replaceAll("\\|", ")");
                        if (!current.contains(reverse)) current.add(reverse);
                    }
                }
            }
            r = current;
        }
        return r;
    }

    public static List<String> generateParenthesisO(int n) {
        List<String> r = new ArrayList<>();
        StringBuilder i = new StringBuilder("()");
        r.add(i.toString());
        if (n == 1) return r;
        for (int j = 1; j < n; j++) {
            List<String> current = new ArrayList<>();
            for (String s : r) {
                for (int l = 0; l < s.length(); l++) {
                    StringBuilder c = new StringBuilder(s).insert(l, i);
                    if (!current.contains(c.toString())) current.add(c.toString());
                }
            }
            r = current;
        }
        return r;
    }

    public List<String> generateParenthesisS(int n) {
        List<String> ans = new ArrayList();
        if (n == 0) {
            ans.add("");
        } else {
            for (int c = 0; c < n; ++c)
                for (String left: generateParenthesis(c))
                    for (String right: generateParenthesis(n-1-c))
                        ans.add("(" + left + ")" + right);
        }
        return ans;
    }
}