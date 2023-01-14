public class Main {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
    }

    public static int maxArea(int[] height) {
        int r = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = height.length - 1; j >= i + 1; j--) {
                int l = Math.min(height[i], height[j]);
                int w = j - i;
                r = Math.max(l * w, r);
                if (height[i] * w < r || height[i] == height[j]) break;
            }
        }
        return r;
    }
}