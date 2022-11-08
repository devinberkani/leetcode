public class Main {
    public static void main(String[] args) {
        System.out.println(addDigits(10));
    }

    public static int addDigits(int num) {

        if (num < 10) {
            return num;
        }

        while (num >= 10) {
            num = sum(num);
        }

        return num;

    }

    public static int sum (int num) {
        int sum = 0;

        while (num > 0) {
            int l = num % 10;
            sum += l;
            num /= 10;
        }

        return sum;
    }
}