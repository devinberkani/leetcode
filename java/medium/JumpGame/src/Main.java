public class Main {
    public static void main(String[] args) {
        System.out.println(canJump(new int[] {2,3,1,1,4}));
        System.out.println(canJump(new int[] {3,2,1,0,4}));
    }

    public static boolean canJump(int[] nums) {
        if (nums.length == 1) return true;
        if (nums[0] == 0) return false;
        int c = nums[0];
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > --c) c = nums[i];
            if (c == 0) return false;
        }
        return true;
    }
}