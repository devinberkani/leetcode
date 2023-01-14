import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[] {"",""}));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> h = new HashMap<>();
        for (String str : strs) {
            String[] a = str.split("");
            Arrays.sort(a);
            if (!h.containsKey(Arrays.toString(a))) {
                h.put(Arrays.toString(a), new ArrayList<>());
                h.get(Arrays.toString(a)).add(str);
            } else {
                h.get(Arrays.toString(a)).add(str);
            }
        }
        return new ArrayList<>(h.values());
    }
}