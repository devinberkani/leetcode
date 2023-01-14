import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(readBinaryWatch(9));
    }

    public static List<String> readBinaryWatch(int turnedOn) {
        List<String> r = new ArrayList<>();

        if (turnedOn < 9) {
            for (int h = 0; h < 12; h++) {
                for (int m = 0; m < 60; m++) {
                    if (Integer.bitCount(h) + Integer.bitCount(m) == turnedOn) {
                        StringBuilder c = new StringBuilder();
                        c.append(h).append(":");
                        if (m < 10) {
                            c.append(0);
                        }
                        c.append(m);
                        r.add(c.toString());
                    }
                }
            }
        }
        return r;
    }
}