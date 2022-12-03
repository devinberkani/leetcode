public class Main {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring(",./?;'[]1234   456abcHJKL"));
    }

//dvdf
//pwwkew
//bbbbb
//abcabcbb
//au
//,./?;'[]1234   456abcHJKL

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        if (s.length() == 1) return 1;
        int r = 0;
        int b = 0;
        int e = 1;
        String c = s.substring(b, e);
        while (b < s.length()) {
            if (e != s.length() && !c.contains(String.valueOf(s.charAt(e)))) {
                e++;
            } else {
                r = Math.max(r, c.length());
                b++;
                e = Math.min(b + 1, s.length());
            }
            c = s.substring(b, e);
        }
        return Math.max(r, c.length());
    }
}