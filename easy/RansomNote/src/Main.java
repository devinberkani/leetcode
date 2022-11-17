import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(canConstruct("bg", "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        String[] mArr = magazine.split("");
        ArrayList<String> m = new ArrayList<>(Arrays.asList(mArr));

        for (int i = 0; i < ransomNote.length(); i++) {
            if (m.contains(ransomNote.split("")[i])) {
                m.remove(ransomNote.split("")[i]);
            } else {
                return false;
            }
        }
        return true;
    }
}