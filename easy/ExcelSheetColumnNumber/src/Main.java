public class Main {
    public static void main(String[] args) {
        System.out.println(titleToNumber("ZY"));
    }

    public static int titleToNumber(String columnTitle) {
        int total = 0;
        int multiplier = 1;

        for (int i = columnTitle.toCharArray().length - 1; i >= 0; i--) {
            total += (columnTitle.toCharArray()[i] - 64) * multiplier;
            multiplier *= 26;
        }
        return total;
    }
}