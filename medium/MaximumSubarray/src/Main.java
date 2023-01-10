public class Main {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[] {-1,1,2,1}));
    }

    public static int maxSubArray(int[] nums) {
        int m = nums[0];
        int c = nums[0];
        for (int i = 1; i < nums.length; i++) {
            System.out.println("c is " + c);
            if (c + nums[i] > 0 || c + nums[i] > m) {
                c += nums[i];
                m = Math.max(m, c);
            } else c = 0;
            if (nums[i] > m) {
                c = nums[i];
                m = nums[i];
            }
        }
        return m;
    }
}