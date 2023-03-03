import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0,2,1,0,1,0,0,2,2,2,1,1,1,1,1};
        System.out.println(Arrays.toString(arr));
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sortColors(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }

    public static void quickSort(int[] nums, int start, int end) {
        if (start < end) {
            int partitionIndex = partition(nums, start, end);
            quickSort(nums, start, partitionIndex - 1);
            quickSort(nums, partitionIndex + 1, end);
        }
    }

    public static int partition(int[] nums, int start, int end) {
        // end is pivot index
        int partitionIndex = start;
        for (int i = start; i < end; i++) {
            if (nums[i] <= nums[end]) {
                swap(nums, partitionIndex, i);
                partitionIndex++;
            }
        }
        swap(nums, partitionIndex, end);
        return partitionIndex;
    }

    public static void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}