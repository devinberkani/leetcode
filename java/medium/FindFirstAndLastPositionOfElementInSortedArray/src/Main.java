import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{5,7,7,8,8,10}, 8)));
        System.out.println(Arrays.toString(searchRange(new int[]{-69,5,7,7,8,8,10,69}, 69)));
        System.out.println(Arrays.toString(searchRange(new int[]{5}, 5)));
        System.out.println(Arrays.toString(searchRange(new int[]{1,2,2,2,3}, 2)));
        System.out.println(Arrays.toString(searchRange(new int[]{1,4}, 4)));
        System.out.println(Arrays.toString(searchRange(new int[]{2,2}, 2)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1,-1};
        int l = 0;
        int r = nums.length - 1;
        int mid;

        // check for existence
        while (l <= r) {
            mid = (r + l) / 2;
            if (nums[mid] == target) {
                l = 0;
                r = mid;
                break;
            }
            else if (nums[mid] > target) r = mid - 1;
            else if (nums[mid] < target) l = mid + 1;
        }


        // find start
        while (l <= r) {
            mid = (r + l) / 2;
            if (nums[mid] == target) {
                if (mid - 1 < 0) {
                    result[0] = 0;
                    l = 0;
                    r = nums.length - 1;
                    break;
                } else if (nums[mid - 1] != target) {
                    result[0] = mid;
                    l = mid;
                    r = nums.length - 1;
                    break;
                }
                r = mid - 1;
            }
            else if (nums[mid] < target) l = mid + 1;
        }

        //find end
        while (l <= r) {
            mid = (r + l) / 2;
            if (nums[mid] == target) {
                if (mid + 1 > nums.length - 1) {
                    result[1] = nums.length - 1;
                    break;
                } else if (nums[mid + 1] != target) {
                    result[1] = mid;
                    break;
                }
                l = mid + 1;
            }
            else if (nums[mid] > target) r = mid - 1;
        }
        return result;
    }
}