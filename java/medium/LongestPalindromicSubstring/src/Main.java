public class Main {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("cbbd"));
    }

    static int resStart;
    static int resLength;
    public static String longestPalindrome(String s) {

        if (s.length() < 2) return s;

        for (int start = 0; start < s.length() - 1; start++) {
            expandFromCenter(s, start, start);
            expandFromCenter(s, start, start + 1);
        }

        return s.substring(resStart, resLength + resStart);
    }

    public static void expandFromCenter(String s, int left, int right) {
        int l = left, r = right;
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        if (r - l - 1 > resLength) {
            resStart = l + 1;
            resLength = r - l - 1;
        }
    }

    //brute force
//    public static String longestPalindrome(String s) {
//        if (s.length() < 2) return s;
//        int LPL = 1, start = 0;
//        for (int i = 0; i < s.length(); i++) {
//            for (int j = i; j < s.length(); j++) {
//                int flag = 1;
//                for (int check = 0; check < (j - i + 1) / 2; check++) {
//                    if (s.charAt(i + check) != s.charAt(j - check)) {
//                        flag = 0;
//                        break;
//                    }
//                }
//                if (flag == 1 && j - i + 1 > LPL) {
//                    start = i;
//                    LPL = j - i + 1;
//                }
//            }
//        }
//        return s.substring(start, LPL + start);
//    }
}