public class Main {
    public static void main(String[] args) {
        System.out.println(multiply("123", "456"));
    }
    public static String multiply(String num1, String num2) {
        StringBuilder result = new StringBuilder();

        int i = num1.length() - 1;
        int z = 0;
        while (i >= 0) {
            int j = num2.length() - 1;
            int k = result.length() - 1;
            int rP = 0;
            int rS = 0;
            int zC = 0;
            StringBuilder currentSum = new StringBuilder();
            while (j >= 0 || k >= 0 || rP > 0 || rS > 0) {

                while (zC++ < z) currentSum.insert(0, result.charAt(k--) - '0');

                int product = rP;
                if (j >= 0) product += (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                rP = product / 10;

                int sum = rS + (product % 10);
                if (k >= 0) sum += result.charAt(k--) - '0';
                rS = sum / 10;
                currentSum.insert(0, sum % 10);
                j--;
            }
            result = currentSum;
            i--;
            z++;
        }
        return result.toString().charAt(0) != '0' ? result.toString() : "0";
    }

//    public static String multiply(String num1, String num2) {
//        StringBuilder r = new StringBuilder();
//        int numZeros = -1;
//        int remainderProduct = 0;
//        int remainderSum = 0;
//        int z = 0;
//        String longestNumber = num1.length() > num2.length() ? num1 : num2;
//        String shortestNumber = longestNumber.equals(num1) ? num2 : num1;
//
//        for (int i = shortestNumber.length() - 1; i >= 0; i--) {
//            numZeros++;
//            StringBuilder product = new StringBuilder();
//            while (z++ < numZeros) product.append("0");
//            int currentBottomNumber = shortestNumber.charAt(i) - '0';
//            for (int j = longestNumber.length() - 1; j >= 0; j--) {
//                int currentTopNumber = longestNumber.charAt(j) - '0';
//                int currProduct = remainderProduct + currentBottomNumber * currentTopNumber;
//                product.insert(0, currProduct % 10);
//                remainderProduct = currProduct / 10;
//            }
//            if (remainderProduct > 0) product.insert(0, remainderProduct);
//            r = add(r, product);
//            System.out.println(r);
//        }
//
//        return r.toString();
//    }
//
//    public static StringBuilder add(StringBuilder num1, StringBuilder num2) {
//        StringBuilder result = new StringBuilder();
//        int i = num1.length() - 1;
//        int j = num2.length() - 1;
//        int r = 0;
//
//        while (i >= 0 || j >= 0) {
//            int sum = r;
//
//            if (i >= 0) sum += num1.charAt(i--) - '0';
//            if (j >= 0) sum += num2.charAt(j--) - '0';
//
//            result.insert(0, sum % 10);
//            r = sum / 10;
//        }
//        if (r > 0) result.insert(0, r);
//        return result;
//    }
}