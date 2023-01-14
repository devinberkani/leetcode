public class Main {
    public static void main(String[] args) {
        System.out.println(convertToTitle(2147483647));
    }

    public static String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        if (columnNumber <= 26) {
            return result.append(Character.toString(columnNumber + 64)).toString();
        }

        long multiplier = 26;

        while (columnNumber > (26 * multiplier) + multiplier) {
            multiplier *= 26;
        }

        int count = 0;

        while (columnNumber > 0) {
            columnNumber -= multiplier;
            count++;

            if ((columnNumber <= multiplier && multiplier != 1) || columnNumber == 0) {
                result.append(Character.toString(count + 64));
                multiplier /= 26;
                count = 0;
            }
        }
        return result.toString();
    }
}