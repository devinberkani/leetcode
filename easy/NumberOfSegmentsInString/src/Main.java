public class Main {
    public static void main(String[] args) {
        System.out.println(countSegments("                "));
    }
    public static int countSegments(String s) {
        return s.trim().length() == 0 ? 0 : s.trim().split("\\s+").length;
    }
}