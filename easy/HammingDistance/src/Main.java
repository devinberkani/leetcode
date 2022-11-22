public class Main {
    public static void main(String[] args) {
        System.out.println(hammingDistance(3,1));
    }

    public static int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}