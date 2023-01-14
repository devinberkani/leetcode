public class Main {
    public static void main(String[] args) {
        System.out.println(jump(new int[] {1,2,1,1,1}));
//        5,6,4,4,6,9,4,4,7,4,4,8,2,6,8,1,5,9,6,5,2,7,9,7,9,6,9,4,1,6,8,8,4,4,2,0,3,8,5
//        9,8,2,2,0,2,2,0,4,1,5,7,9,6,6,0,6,5,0,5
    }

    public static int jump(int[] nums) {
        int r = 0;
        int i = 0;
        while (i < nums.length - 1) {
            int current = nums[i];
            int j = i + 1;
            int next = j;
            int biggestDiff = nums[j] - current;
            while (j < nums.length && current > 0) {
                int currentDiff = nums[j] - current;
//                System.out.println("current diff of " + current + " and " + nums[j] + " is " + currentDiff);
//                System.out.println("biggest diff is " + biggestDiff);
                if (j == nums.length - 1 || currentDiff >= biggestDiff) {
                    biggestDiff = currentDiff;
                    next = j;
                }
                current--;
                j++;
            }
            i = next;
            r++;
        }
        return r;
    }


    // too slow
//    public static int h(int[] nums, int minResult, int currJumps, int currIndex) {
//
//        if (currIndex == nums.length - 1) return currJumps;
//        if (currIndex > nums.length - 1 || nums[currIndex] == 0) return nums.length - 1;
//
//        for (int i = nums[currIndex]; i > 0; i--) {
//            minResult = Math.min(minResult, h(nums, minResult, currJumps + 1, currIndex + i));
//        }
//
//        return minResult;
//    }
}