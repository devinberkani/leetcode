public class Main {
    public static void main(String[] args) {
        System.out.println(maxCount(3, 3, new int[][] {}));
    }

//    {{16,1},{14,3},{14,2},{4,1},{10,1},{11,1},{8,3},{16,2},{13,1},{8,3},{2,2},{9,1},{3,1},{2,2},{6,3}}
//    {{2,2},{3,3},{3,3},{3,3},{2,2},{3,3},{3,3},{3,3},{2,2},{3,3},{3,3},{3,3}}

    public static int maxCount(int m, int n, int[][] ops) {
        for (int[] o : ops) {
            m = Math.min(o[0], m);
            n = Math.min(o[1], n);
        }
        return m * n;
    }
}