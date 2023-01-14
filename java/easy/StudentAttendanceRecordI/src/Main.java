public class Main {
    public static void main(String[] args) {
        System.out.println(checkRecord("AAAAAAAAAAAAAAAAAA"));
    }

    public static boolean checkRecord(String s) {
        return !s.matches("[ALP]*LLL[ALP]*") && !s.matches("[ALP]*A[ALP]*A[ALP]*");
    }
}