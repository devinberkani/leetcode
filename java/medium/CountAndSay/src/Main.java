public class Main {
    public static void main(String[] args) {
        System.out.println(countAndSay(5));
    }

    public static String countAndSay(int n) {
        if (n == 1) return "1";

        StringBuilder r = new StringBuilder();
        String str = countAndSay(n - 1);
        if (str.length() == 1) r.append("1").append(str);
        else {
            char current = str.charAt(0);
            int count = 1;
            for (int i = 0; i < str.length() - 1; i++) {
                char next = str.charAt(i + 1);
                if (current == next) count++;
                else {
                    r.append(count).append(current);
                    current = next;
                    count = 1;
                }
                if (i == str.length() - 2) r.append(count).append(current);
            }
        }
        return r.toString();
    }
}