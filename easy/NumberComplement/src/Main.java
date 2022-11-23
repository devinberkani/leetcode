public class Main {
    public static void main(String[] args) {
        System.out.println(findComplement(1));
    }

    //001
    //000

    //

    public static int findComplement(int num) {
        StringBuilder r = new StringBuilder();
        while (num > 0) {
            r.insert(0, (num & 1) == 1 ? 0 : 1);
            num >>= 1;
        }
        return Integer.parseInt(r.toString(), 2);
    }

    public static int findComplement2(int num) {
        return Integer.parseInt(Integer.toBinaryString(~num).substring(Integer.toBinaryString(~num).length() - Integer.toBinaryString(num).length()), 2);
    }
}