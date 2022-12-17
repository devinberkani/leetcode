public class Main {
    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));
    }

    public static int strStr(String haystack, String needle) {
        int r = 0;
        int i = 0;
        int s = 0;
        while (i < haystack.length()) {
            if (haystack.charAt(i) == needle.charAt(r)) {
                r++;
                if (r == needle.length()) return i - (r - 1);
            } else {
                s++;
                i = s - 1;
                r = 0;
            }
            i++;
        }
        return -1;
    }

//    public static int strStr(String haystack, String needle) {
//        return haystack.indexOf(needle);
//    }
}