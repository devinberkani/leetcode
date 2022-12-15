import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(letterCombinations("29"));
    }


    public static List<String> letterCombinations(String digits) {
        HashMap<Character, Character> v = new HashMap<>();
        v.put('2', 'a');
        v.put('3', 'd');
        v.put('4', 'g');
        v.put('5', 'j');
        v.put('6', 'm');
        v.put('7', 'p');
        v.put('8', 't');
        v.put('9', 'w');
        List<String> r = new ArrayList<>();
        if (digits.length() == 0) return r;
        h(v, digits, r, 0, "");
        return r;
    }

    private static void h(HashMap<Character, Character> v, String d, List<String> r, int i, String s) {
        if (i == d.length()) {
            r.add(s);
            return;
        }
        int n = d.charAt(i) == '7' || d.charAt(i) == '9' ? 4 : 3;
        for (int j = 0; j < n; j++) h(v, d, r, i + 1, s + (char) (v.get(d.charAt(i)) + j));

    }

    //slightly slower solution
//    private static void h(String d, List<String> r, int i, String s) {
//        int n = Integer.parseInt(String.valueOf(d.charAt(i)));
//        int m = n == 7 || n == 9 ? 4 : 3;
//        int l = n <= 7 ? ((n - 2) * 3) + 97 : n == 8 ? 116 : 119;
//        for (int j = 0; j < m; j++) {
//            if (i != 0) h(d, r, i + 1 < d.length() ? i + 1 : 0, s + (char) (l + j));
//            else r.add((char) (l + j) + s);
//        }
//    }
}