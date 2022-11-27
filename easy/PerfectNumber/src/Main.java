public class Main {
    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(29));
    }

    public static boolean checkPerfectNumber(int num) {
        if (num == 1) {
            return false;
        }
        int s = 0;
        int t = 2;
        int p = t;
        while (t < num / 2) {
            if (num % t == 0) {
                if (num / t != p) {
                    p = t;
                    s += t;
                    s += num / t;
                } else {
                    break;
                }
            }
            t++;
        }
        return s + 1 == num;
    }
}