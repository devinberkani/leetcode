public class Main {
    public static void main(String[] args) {
        System.out.println(isSubsequence("acb", "ahbgdc"));
    }

    public static boolean isSubsequence(String s, String t) {

        if (s.length() == 0) {
            return true;
        }

        if (s.length() == t.length() && !s.equals(t)) {
            return false;
        }

        int last = t.indexOf(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int current = t.indexOf(s.charAt(i), last + 1);
            if (current <= last) {
                return false;
            }
            last = current;
        }
        return true;
    }
}