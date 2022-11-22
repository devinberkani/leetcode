public class Main {
    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("abcabcabcabc"));
    }

    public static boolean repeatedSubstringPattern(String s) {
        if (isPrime(s.length())) {
            return s.split(s.substring(0,1)).length == 0;
        }

        int i = 2;
        while (i <= s.length() / 2) {
            if (s.length() % i == 0) {
                if (s.split(s.substring(0, s.length() / i)).length == 0) {
                    return true;
                }
            }
            i = nextPrime(i);
        }
        return false;
    }

    public static int nextPrime(int num) {
        num++;
        for (int i = 2; i < num; i++) {
            if(num%i == 0) {
                num++;
                i=2;
            }
        }
        return num;
    }

    public static boolean isPrime (int n) {

        if (n <= 1) {
            return false;
        }

        if (n == 2) {
            return true;
        }

        if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}