import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(4));
    }

    public static List<String> generateParenthesis(int n) {
        List<String> r = new ArrayList<>();
        StringBuilder i = new StringBuilder("()");
        r.add(i.toString());
        if (n == 1) return r;
        int j = 1;
        while (j < n) {
            int k = 0;
            List<String> current = new ArrayList<>();
            while (k < r.size()) {
                int l = 0;
                while (l < r.get(k).length()) {
                    StringBuilder c = new StringBuilder(r.get(k)).insert(l,i);
                    if (!current.contains(c.toString())) current.add(c.toString());
                    l++;
                }
                k++;
            }
            r = current;
            j++;
        }
        return r;
    }

    // ()
    // (()) ()()
    // ()(()) (()()) ((())) (()()) ()()()

    // ()()(), (()()), ((())), ()(()), (())()
    // 0,0,0,   0,1,1   0,1,2   0,1,0   0,2,1
    // ()()(), (())(), ()(()), (()()), ((()))
    // 0,0,0    0,0,1  0,1,0   0,1,1,   0,1,2
    // ["((()))","(()())","(())()","()(())","()()()"]
    // ((())), (()()), (())(), ()(()), ()()()
    // ()()
    //  0,1,2   0,1,1   0,0,1   0,1,0   0,0,0


    // ()()(), ((())), (()()), ()(()), (())()
}