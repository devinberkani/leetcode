public class Main {
    public static void main(String[] args) {
        System.out.println(convert("A,B,C,D", 4));
    }

    public static String convert(String s, int numRows) {
        if (numRows == 1 || numRows == s.length()) return s;
        String[] r = new String[Math.min(numRows, s.length())];
        int c = 0;
        int i = 0;
        boolean d = false;
        while (c < s.length()) {
            r[i] = r[i] != null ? r[i] += s.charAt(c) : String.valueOf(s.charAt(c));
            c++;

            if (i == numRows - 1) d = true;
            else if (i == 0) d = false;

            if (!d) i++;
            else i--;
        }

        return String.join("", r);
    }
}