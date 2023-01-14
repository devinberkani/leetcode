import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findRestaurant(new String[]{"Shogun","Tapioca Express","Burger King","KFC"}, new String[]{"KNN","KFC","Burger King","Tapioca Express","Shogun"})));
    }

    public static String[] findRestaurant(String[] list1, String[] list2) {
        List<String> r = new ArrayList<>();
        List<String> shortest = list1.length < list2.length ? Arrays.asList(list1) : Arrays.asList(list2);
        List<String> longest = shortest.equals(Arrays.asList(list1)) ? Arrays.asList(list2) : Arrays.asList(list1);
        int m = Integer.MAX_VALUE;
        for (int i = 0; i < shortest.size(); i++) {
            if (longest.contains(shortest.get(i))) {
                int c = longest.indexOf(shortest.get(i));
                if (c + i < m) m = c + i;
            }
        }

        for (int i = 0; i < shortest.size(); i++) {
            if (longest.contains(shortest.get(i))) {
                int c = longest.indexOf(shortest.get(i));
                if (c + i == m) r.add(shortest.get(i));
            }
        }
        return r.toArray(new String[0]);
    }
}