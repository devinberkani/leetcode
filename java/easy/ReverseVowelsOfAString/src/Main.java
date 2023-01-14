public class Main {
    public static void main(String[] args) {
        System.out.println(reverseVowels("abababae"));
    }

    public static String reverseVowels(String s) {
        StringBuilder result = new StringBuilder();
        String r = new StringBuilder(String.join("", s.split("[^aeiouAEIOU]"))).reverse().toString();
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (String.valueOf(s.charAt(i)).matches("[aeiouAEIOU]")) {
                result.append(r.charAt(index));
                index++;
            } else {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
}