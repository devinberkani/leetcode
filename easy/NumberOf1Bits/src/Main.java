public class Main {
    public static void main(String[] args) {
        System.out.println(hammingWeight(7));
    }

    public static int hammingWeight(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result = (n & 1) == 1 ? result + 1 : result;
            n >>= 1;
        }
        return result;
    }
}