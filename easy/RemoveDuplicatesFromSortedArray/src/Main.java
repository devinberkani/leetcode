public class Main {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[] {1,1,2}));
    }

    public static int removeDuplicates(int[] nums) {

        if (nums.length == 1) {
            return 1;
        }

        int index = 1;
        int count = 0;
        int current = Integer.MAX_VALUE;
        int next = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (current != next) {
                count++;
            }
            current = nums[i];
            if (i != nums.length - 1) {
                next = nums[i + 1];
            }

            if (current != next) {
                nums[index] = next;
                index++;
            }
        }
        for (int n : nums) {
            System.out.println(n);
        }
        return count;
    }
}