public class Main {
    public static void main(String[] args) {
        System.out.println(convertToBase7(-49));
    }

    public static String convertToBase7(int num) {
        int o = num;
        StringBuilder r = new StringBuilder();
        num = Math.abs(num);
        r.append(num % 7);
        num -= num % 7;
        while (num > 0) {
            if (num / 7 >= 7) {
                r.append(0);
                num /= 7;
            } else {
                r.append(num / 7);
                num -= 7 * (num / 7);
            }
        }
        if (o < 0) {
            r.append("-");
        }
        return r.reverse().toString();
    }
}