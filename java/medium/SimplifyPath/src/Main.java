import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        System.out.println(simplifyPath("/a/./b/../../c/"));
        System.out.println(simplifyPath("/a/../"));
        System.out.println(simplifyPath("/a/.."));
        System.out.println(simplifyPath("/../../../../../a"));
        System.out.println(simplifyPath("/a/../.././../../."));
        System.out.println(simplifyPath("/..hidden"));
        System.out.println(simplifyPath("/.hidden//////"));

//        Input : /a/./b/../../c/
//                Output : /c
//
//        Input : /a/..
//        Output : /
//
//        Input : /a/../
//        Ouput : /
//
//        Input : /../../../../../a
//        Ouput : /a
//
//        Input : /a/./b/./c/./d/
//                Ouput : /a/b/c/d
//
//        Input : /a/../.././../../.
//        Ouput : /
//
//        Input : /a//b//c//////d
//        Ouput : /a/b/c/d
    }

    public static String simplifyPath(String path) {
        Deque<StringBuilder> p = new ArrayDeque<>();
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) != '/') {
                StringBuilder c = new StringBuilder("/");
                StringBuilder numPeriods = new StringBuilder();
                while (i < path.length() && path.charAt(i) == '.') numPeriods.append(path.charAt(i++));
                if (numPeriods.length() >= 3) c.append(numPeriods);
                if (i < path.length() && path.charAt(i) != '/') {
                    if (numPeriods.length() <= 2) c.append(numPeriods);
                    numPeriods = new StringBuilder();
                    while (i < path.length() && path.charAt(i) != '/') c.append(path.charAt(i++));
                }
                if (numPeriods.length() == 2) p.pollLast();
                if (c.length() > 1) p.addLast(c);
            }
        }
        if (p.size() == 0) return "/";
        StringBuilder r = new StringBuilder();
        p.forEach(r::append);
        return r.toString();
    }
}