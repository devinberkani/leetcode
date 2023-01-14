import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(arrayPairSum(new int[] {6,2,6,5,1,2}));
    }

    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int s = 0;
        for (int i = 0; i < nums.length; i+=2) {
            s += nums[i];
        }
        return s;
    }
}