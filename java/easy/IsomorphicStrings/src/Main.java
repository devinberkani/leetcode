import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("1234", "5678"));
    }

    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> letters = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!letters.containsKey(s.charAt(i))) {
                if (letters.containsValue(t.charAt(i))) {
                    return false;
                }
                letters.put(s.charAt(i), t.charAt(i));
            } else if ((letters.get(s.charAt(i)) != t.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}