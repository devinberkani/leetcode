public class Main {
    public static void main(String[] args) {
        System.out.println(licenseKeyFormatting("w24-x", 2));
    }

    public static String licenseKeyFormatting(String s, int k) {
        StringBuilder r = new StringBuilder(s.toUpperCase().replaceAll("-",""));
        for (int i = r.length() - k; i > 0; i-=k) {
            r.insert(i, "-");
        }
        return r.toString();
    }
}