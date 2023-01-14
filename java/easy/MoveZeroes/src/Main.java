public class Main {
    public static void main(String[] args) {
        moveZeroes(new int[] {0});
    }

    public static void moveZeroes(int[] nums) {

        if (nums.length == 1) {
            return;
        }

        int nextIndex = 0;
        int zeroCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nextIndex] = nums[i];
                nextIndex++;
            } else {
                zeroCount++;
            }
        }

        for (int i = nums.length - 1; i >= nums.length - zeroCount; i--) {
            nums[i] = 0;
        }

        for (int n : nums) {
            System.out.println(n);
        }

    }
}