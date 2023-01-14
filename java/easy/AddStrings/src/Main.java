public class Main {
    public static void main(String[] args) {
        System.out.println(addStrings2("1", "2999"));
    }

    public static String addStrings(String num1, String num2) {
        String longest = num1.length() > num2.length() ? num1 : num2;
        StringBuilder shortest = new StringBuilder(longest.equals(num1) ? num2 : num1);

        while (shortest.length() < longest.length()) {
            shortest.insert(0,"0");
        }

        StringBuilder result = new StringBuilder();
        int carry = 0;

        System.out.println(longest);
        System.out.println(shortest);

        for (int i = longest.length() - 1; i >= 0; i--) {
            int curr1 = Integer.parseInt(String.valueOf(longest.charAt(i)));
            int curr2 = Integer.parseInt(String.valueOf(shortest.charAt(i)));
            int total = curr1 + curr2 + carry;
            if (total < 10) {
                result.insert(0, total);
                carry = 0;
            } else {
                result.insert(0, total - 10);
                carry = 1;
            }
        }

        if (carry == 1) {
            result.insert(0, carry);
        }

        return result.toString();
    }

    // better solution found in discussions

    public static String addStrings2(String num1, String num2) {
        int carry=0;
        StringBuilder result = new StringBuilder();
        int i=num1.length() -1;
        int j=num2.length() -1;
        while(i>=0 || j>=0)
        {

            int n1 = (i<0)?0:num1.charAt(i)-'0';
            int n2 = (j<0)?0:num2.charAt(j)-'0';

            int sum=n1+n2+carry;
            result.append(sum%10);
            carry=sum/10;

            i--;
            j--;
        }
        if(carry==1){
            result.append(carry);
        }
        return result.reverse().toString();
    }
}