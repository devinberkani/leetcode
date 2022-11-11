import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog dog dog dog"));
    }

    public static boolean wordPattern(String pattern, String s) {

        if (pattern.length() != s.split(" ").length) {
            return false;
        }

        HashMap<Character, String> h = new HashMap<>();

        for (int i = 0; i < s.split(" ").length; i++) {
            if (!h.containsKey(pattern.charAt(i))) {
                if (!h.containsValue(s.split(" ")[i])) {
                    h.put(pattern.charAt(i), s.split(" ")[i]);
                } else {
                    return false;
                }
            } else if (!h.get(pattern.charAt(i)).equals(s.split(" ")[i])) {
                return false;
            }
        }
        return true;
    }
}