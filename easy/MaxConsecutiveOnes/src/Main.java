import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[] {1,1,1,0,1,1};
        System.out.println(findMaxConsecutiveOnes2(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        String[] u = String.join("", Arrays.toString(nums).replaceAll("[],\\s\\[]", "")).split("[0]+");
        Arrays.sort(u);
        return u.length == 0 ? 0 : u[u.length - 1].length();
    }

    public static int findMaxConsecutiveOnes2(int[] nums) {
        int c = 0;
        int f = 0;
        for (int num : nums)
            if (num == 1) {
                c++;
            } else {
                if (c > f) {
                    f = c;
                }
                c = 0;
            }
        return Math.max(c, f);
    }
}