public class Main {
    public static void main(String[] args) {
        NumArray numArray = new NumArray(new int[] {-2,0,3,-5,2,-1});
        int param_1 = numArray.sumRange(0,2);
        int param_2 = numArray.sumRange(2,5);
        int param_3 = numArray.sumRange(0,5);
        System.out.println(param_1);
        System.out.println(param_2);
        System.out.println(param_3);
    }
}

class NumArray {
    int[] nums;
    public NumArray(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        int t = 0;
        for (int i = left; i <= right; i++) {
            t += nums[i];
        }
        return t;
    }
}