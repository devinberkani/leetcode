public class Main {
    public static void main(String[] args) {
        System.out.println(search(new int[] {7,8,9,10,1,2,3,4,5,6}, 7));
        System.out.println(search(new int[] {7,8,9,10,1,2,3,4,5,6}, 8));
        System.out.println(search(new int[] {7,8,9,10,1,2,3,4,5,6}, 9));
        System.out.println(search(new int[] {7,8,9,10,1,2,3,4,5,6}, 10));
        System.out.println(search(new int[] {7,8,9,10,1,2,3,4,5,6}, 1));
        System.out.println(search(new int[] {7,8,9,10,1,2,3,4,5,6}, 2));
        System.out.println(search(new int[] {7,8,9,10,1,2,3,4,5,6}, 3));
        System.out.println(search(new int[] {7,8,9,10,1,2,3,4,5,6}, 4));
        System.out.println(search(new int[] {7,8,9,10,1,2,3,4,5,6}, 5));
        System.out.println(search(new int[] {7,8,9,10,1,2,3,4,5,6}, 6));
        System.out.println(search(new int[] {7,8,9,10,1,2,3,4,5,6}, -69));
        System.out.println(search(new int[] {4,5,6,7,0,1,2}, 3));
        System.out.println(search(new int[] {1}, 1));
        System.out.println(search(new int[] {3,5,1}, 0));



    }

    // 4 + 9 = 6
    // 6 + 9 = 7
    // 7 + 9 = 8
    // 8 + 9 = 8
    //


    public static int search(int[] nums, int target) {
        if (nums.length == 1) return nums[0] == target ? 0 : -1;
        if (nums.length == 2) return nums[0] == target ? 0 : nums[1] == target ? 1 : -1;
        boolean pivot = nums[0] > nums[nums.length - 1];
        int smallest = 0;
        int largest = nums.length - 1;
        int l;
        int r;
        int mid;

        if (pivot) {
            l = 1;
            r = nums.length - 1;
            while (smallest == 0) {
                mid = (r + l) / 2;
                if (nums[mid] < nums[mid - 1]) smallest = mid;
                else if (nums[mid] < nums[0]) l--;
                else r++;
            }
            largest = smallest - 1;
        }

        if (target < nums[smallest] || target > nums[largest] || (target > nums[nums.length - 1] && target < nums[0])) return -1;
        if (target == nums[smallest]) return smallest;
        if (target == nums[largest]) return largest;

        if (target > nums[smallest] && target < nums[0]) {
            l = smallest;
            r = nums.length - 1;
        } else {
            l = 0;
            r = largest;
        }

        while (l <= r) {
            mid = (r + l) / 2;
            if (nums[mid] == target) return mid;
            if (target < nums[mid]) r = mid - 1;
            if (target > nums[mid]) l = mid + 1;
        }

        return -1;
    }
}