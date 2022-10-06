public class Main {
    public static void main(String[] args) {
        String[] strings = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strings));
    }

    public static String longestCommonPrefix(String[] strs) {

        String longestPrefix = "";
        StringBuilder testPrefix = new StringBuilder("");

        for (int i = 0; i < strs[0].length(); i++) {
            testPrefix.append(strs[0].charAt(i));
            for (String word : strs) {
                if (!word.startsWith(testPrefix.toString())) {
                    return longestPrefix;
                }
            }
            longestPrefix = testPrefix.toString();
        }

        return longestPrefix;
    }
}