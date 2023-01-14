import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(findLHS(new int[] {1,1,1,1}));
    }

    public static int findLHS(int[] nums) {
        if (nums.length == 1) return 0;
        int r = 0;
        int[] s = nums.clone();
        Arrays.sort(s);
        for (int i = 0; i < s.length - 1; i++) {
            if (Math.abs(s[i] - s[i + 1]) == 1) {
                int c = 0;
                for (int num : nums)
                    if (num == s[i] || num == s[i + 1])
                        c++;
                r = Math.max(r, c);
            }
        }
        return r;
    }



//        if (nums.length == 1) return 0;
//        int r = 0;
//        for (int i = 0; i < nums.length - 1; i++) {
//            if (Math.abs(nums[i] - nums[i + 1]) == 1) {
//                int c = 2;
//                for (int j = i + 2; j < nums.length; j++)
//                    if (nums[j] == nums[i] || nums[j] == nums[i + 1])
//                        c++;
//                r = Math.max(r, c);
//            }
//        }
//        return r;
}