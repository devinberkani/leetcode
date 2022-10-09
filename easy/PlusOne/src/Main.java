public class Main {
    public static void main(String[] args) {
        int[] digits = {9};
        plusOne(digits);
    }

    public static int[] plusOne(int[] digits) {

        if (digits[digits.length - 1] != 9) {
            digits[digits.length - 1]++;
            return digits;
        }

        int nineCount = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                break;
            }
            nineCount++;
        }

        int modifiedIndex = digits.length - (nineCount + 1);

        int[] result;
        if (nineCount == digits.length) {
            result = new int[digits.length + 1];
        } else {
            result = new int[digits.length];
        }

        for (int i = result.length - 1; i >= 0; i--) {
            if (i > modifiedIndex) {
                result[i] = 0;
            } else if (i == modifiedIndex) {
                result[i] = digits[i] + 1;
            } else {
                result[i] = digits[i];
            }
        }

        if (nineCount == digits.length) {
            result[0] = 1;
        }

        return result;
    }
}