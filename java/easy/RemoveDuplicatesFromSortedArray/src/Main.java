public class Main {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[] {1,2,3}));
    }

    public static int removeDuplicates(int[] nums) {

        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}