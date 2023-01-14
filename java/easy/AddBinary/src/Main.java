public class Main {
    public static void main(String[] args) {
        String a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        String b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
        System.out.println(addBinary(a, b));
    }

    public static String addBinary(String a, String b) {

        StringBuilder aReversed = new StringBuilder(a).reverse();
        StringBuilder bReversed = new StringBuilder(b).reverse();
        StringBuilder result = new StringBuilder("0");

        int max = Math.max(a.length(), b.length());
        for (int i = 0; i < max; i++) {

            if (i > aReversed.length() - 1) {
                aReversed.append("0");
            }

            if (i > bReversed.length() - 1) {
                bReversed.append("0");
            }

            if (aReversed.charAt(i) == '0' && bReversed.charAt(i) == '0') {
                if (result.charAt(i) == '0') {
                    result.replace(i, i + 1, "0");
                } else if (result.charAt(i) == '1') {
                    result.replace(i, i + 1, "1");
                }
                if (i != max - 1) {
                    result.append('0');
                }
            } else if (aReversed.charAt(i) == '0' && bReversed.charAt(i) == '1' || aReversed.charAt(i) == '1' && bReversed.charAt(i) == '0') {
                if (result.charAt(i) == '0') {
                    result.replace(i, i + 1, "1");
                    if (i != max - 1) {
                        result.append('0');
                    }
                } else if (result.charAt(i) == '1') {
                    result.replace(i, i + 1, "0");
                    result.append('1');
                }
            } else if (aReversed.charAt(i) == '1' && bReversed.charAt(i) == '1') {
                if (result.charAt(i) == '0') {
                    result.replace(i, i + 1, "0");
                    result.append('1');
                } else if (result.charAt(i) == '1') {
                    result.replace(i, i + 1, "1");
                    result.append('1');
                }
            }

        }

        return result.reverse().toString();
    }
}