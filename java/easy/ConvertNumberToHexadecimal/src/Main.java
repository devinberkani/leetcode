public class Main {
    public static void main(String[] args) {
        System.out.println(toHex(-98374589));
    }

    public static String toHex(int num) {
        StringBuilder r = new StringBuilder();
        for (int i = Integer.toBinaryString(num).length(); i > 0; i -= 4) {
            String s = Integer.toBinaryString(num).substring(Math.max(i - 4, 0), i);
            if (Integer.parseInt(s, 2) < 10) {
                r.append(Integer.parseInt(s, 2));
            } else {
                r.append((char)(Integer.parseInt(s, 2) + 87));
            }
        }
        return r.reverse().toString();
    }
}