public class Main {
    public static void main(String[] args) {
        char[] c = {'h', 'e', 'l', 'l', 'o'};
        reverseString(c);
        System.out.println(c);
    }

    public static void reverseString(char[] s) {
        int n = s.length - 1;
        for (int i = 0; i < s.length / 2; i++) {
            char b = s[i];
            s[i] = s[n];
            s[n] = b;
            n--;
        }
    }
}