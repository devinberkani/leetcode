import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(30));
    }

    public static List<String> fizzBuzz(int n) {
        List<String> r = new ArrayList<>();
        int tc = 1;
        int fc = 1;
        int tfc = 1;
        for (int i = 1; i <= n; i++, tc++, fc++, tfc++) {
            if (tfc == 15) {
                r.add("FizzBuzz");
                tfc = 0;
                fc = 0;
                tc = 0;
            } else if (fc == 5) {
                r.add("Buzz");
                fc = 0;
            } else if (tc == 3) {
                r.add("Fizz");
                tc = 0;
            } else {
                r.add(String.valueOf(i));
            }
        }
        return r;
    }
}