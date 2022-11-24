public class Main {
    public static void main(String[] args) {
        System.out.println(findPoisonedDuration(new int [] {0,0,0,0,1,4}, 2));
    }
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries.length == 0) {
            return 0;
        }
        int r = 0;
        int p = timeSeries[0];
        for (int i = 1; i < timeSeries.length; i++) {
            if (timeSeries[i] != p) {
                r += Math.min(timeSeries[i] - p, duration);
                p = timeSeries[i];
            }
        }
        return r + duration;
    }
}