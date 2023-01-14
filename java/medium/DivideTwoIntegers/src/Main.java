public class Main {
    public static void main(String[] args) {
        System.out.println(divide(-2147483648,1));
    }

    public static int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        int sign = dividend < 0 ^ divisor < 0 ? -1 : 1;
        long dvd = Math.abs((long) dividend), dvs = Math.abs((long) divisor), ans = 0;
        while (dvd >= dvs) {
            long temp = dvs, n = 1;
            while (temp << 1 <= dvd) {
                temp <<= 1;
                n <<= 1;
            }
            dvd -= temp;
            ans += n;
        }
        return (int) (sign * ans);
    }

//    if(divisor==0||dividend==Integer.MIN_VALUE&&divisor==-1) return Integer.MAX_VALUE;
//    int res=0;
//    int sign=(dividend<0)^(divisor<0)?-1:1;
//    long dvd=Math.abs((long)dividend);
//    long dvs=Math.abs((long)divisor);
//    while(dvs<=dvd){
//        long temp=dvs,mul=1;
//        while(dvd>=temp<<1){
//            temp<<=1;mul<<=1;
//        }
//        dvd-=temp;res+=mul;
//    }
//    return sign==1?res:-res;

//    public static int divide(int dividend, int divisor) {
//        int sign,result=0,value=31;
//        if ((dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0)) sign = 1;  else sign = -1;
//        long ldividend = Math.abs((long) dividend);
//        long ldivisor = Math.abs((long) divisor);
//        while (ldividend >= ldivisor) {
//            while (ldividend < ldivisor << value) {
//                value--;
//            }
//            ldividend -= ldivisor << value;
//            result += 1 << value;
//        }
//        if (result > Integer.MAX_VALUE) result = Integer.MAX_VALUE;
//        if(dividend==Integer.MIN_VALUE && divisor==-1) result=Integer.MAX_VALUE;
//        result= sign > 0 ? result : -result; return result;
//    }

//    public static int divide(int dividend, int divisor) {
//        if (dividend == divisor) return 1;
//        if (dividend == Integer.MAX_VALUE && divisor == -1) return Integer.MAX_VALUE;
//        int sign = dividend > 0 ^ divisor > 0 ? -1 : 1, ans = 0;
//        int x = Math.abs(dividend), y = Math.abs(divisor);
//        while (x >= y) {
//            int pow = 1;
//            int temp = y;
//            while (temp << 1 <= x) {
//                temp <<= 1;
//                pow <<= 1;
//            }
//            x -= temp;
//            ans += pow;
//        }
//        return ans * sign;
//    }
}