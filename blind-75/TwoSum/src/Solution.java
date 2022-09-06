class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int n1 = nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    int n2 = nums[j];
                    sum = n1 + n2;
                    if (sum == target) {
                        result[0] = j;
                        result[1] = i;
                        break;
                    }
                }
            }
        }
        return result;

    }
}