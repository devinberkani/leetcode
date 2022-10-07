import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(isValid("()[]}}{}{}{"));
    }

    public static boolean isValid(String s) {

        String[] input = s.split("");

        if (input.length % 2 != 0 ||
            input[0].equals(")") ||
            input[0].equals("]") ||
            input[0].equals("}") ||
            input[input.length - 1].equals("(") ||
            input[input.length - 1].equals("[") ||
            input[input.length - 1].equals("{")) {
            return false;
        }

        ArrayList<String> comparison = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {

            switch(input[i]) {
                case "(":
                    if (i != input.length - 1) {
                        comparison.add(i, input[i]);
                        comparison.add(i + 1, ")");
                    }
                    break;

                case "[":
                    if (i != input.length - 1) {
                        comparison.add(i, input[i]);
                        comparison.add(i + 1, "]");
                    }
                    break;

                case "{":
                    if (i != input.length - 1) {
                        comparison.add(i, input[i]);
                        comparison.add(i + 1, "}");
                    }
                    break;
            }
        }

        return Arrays.asList(input).equals(comparison);
    }
}