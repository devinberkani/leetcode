public class Main {
    public static void main(String[] args) {
        String n = String.valueOf(Integer.MAX_VALUE);
        System.out.println(myAtoi("-91283472332"));
    }

    public static int myAtoi(String s) {
        StringBuilder sbr = new StringBuilder();
        boolean lookForSign = true;
        boolean n = false;
        for (int i = 0; i < s.length(); i++) {
            if (!String.valueOf(s.charAt(i)).matches("\\s")) {
                if (String.valueOf(s.charAt(i)).matches("[a-zA-Z]")) return 0;
                else {
                    if (lookForSign && i != 0) {
                        String prev = String.valueOf(s.charAt(i - 1));
                        if (prev.equals(".")) return 0;
                        else if (prev.matches("[+-]")) {
                            n = prev.equals("-");
                            lookForSign = false;
                        } else if ((prev.matches("[0-9]"))) lookForSign = false;
                    }
                    if (String.valueOf(s.charAt(i)).matches("[0-9]")) sbr.append(s.charAt(i));
                    if (i != s.length() - 1 && !String.valueOf(s.charAt(i + 1)).matches("[0-9]")) {
                        break;
                    }
                }
            }
        }
        String r = sbr.toString();
        if (r.length() == 0) return 0;
        try {
            return !n ? Integer.parseInt(r) : Integer.parseInt(r) * -1;
        } catch (Exception e) {
            return !n ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
    }
}