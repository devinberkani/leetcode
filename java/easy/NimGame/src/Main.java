public class Main {
    public static void main(String[] args) {
        System.out.println(canWinNim(Integer.MAX_VALUE));
    }

    public static boolean canWinNim(int n) {
        return n <= 3 || n % 4 != 0;
    }

}