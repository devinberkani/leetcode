import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(validPath(10, new int[][] {{0,7},{0,8},{6,1},{2,0},{0,4},{5,8},{4,7},{1,3},{3,5},{6,5}}, 7, 5));
//        System.out.println(validPath(6, new int[][] {{0,1},{0,2},{3,5},{5,4},{4,3}}, 0, 5));
//        System.out.println(validPath(3, new int[][] {{0,1},{1,2},{2,0}}, 0, 2));
//        System.out.println(validPath(10, new int[][] {{4,3},{1,4},{4,8},{1,7},{6,4},{4,2},{7,4},{4,0},{0,9},{5,4}}, 5, 9));
//        System.out.println(validPath(100, new int[][] {{3,12},{26,84},{10,43},{68,47},{33,10},{87,35},{41,96},{70,92},{38,31},{88,59},{7,30},{89,26},{95,25},{66,28},{14,24},{86,11},{83,65},{14,4},{67,7},{89,45},{52,73},{47,85},{86,53},{68,81},{43,68},{87,78},{94,49},{70,21},{11,82},{60,93},{22,32},{69,99},{7,1},{41,46},{73,94},{98,52},{68,0},{69,89},{37,72},{25,50},{72,78},{96,60},{73,95},{7,69},{97,19},{46,75},{8,38},{19,36},{64,41},{61,78},{97,14},{54,28},{6,18},{25,32},{34,77},{58,60},{17,63},{98,87},{13,76},{58,53},{81,74},{29,6},{37,5},{65,63},{89,56},{61,18},{23,34},{76,29},{73,76},{11,63},{98,0},{54,14},{63,7},{87,32},{79,57},{72,0},{94,16},{85,16},{12,91},{14,17},{30,45},{42,41},{82,69},{24,28},{31,59},{11,88},{41,89},{48,12},{92,76},{84,64},{19,64},{21,32},{30,19},{47,43},{45,27},{31,17},{53,36},{88,3},{83,7},{27,48},{13,6},{14,40},{90,28},{80,85},{29,79},{10,50},{56,86},{82,88},{11,99},{37,55},{62,2},{55,92},{51,53},{9,40},{65,97},{25,57},{7,96},{86,1},{39,93},{45,86},{40,90},{58,75},{99,86},{82,45},{5,81},{89,91},{15,83},{93,38},{3,93},{71,28},{11,97},{74,47},{64,96},{88,96},{4,99},{88,26},{0,55},{36,75},{26,24},{84,88},{58,40},{77,72},{58,48},{50,92},{62,68},{70,49},{41,71},{68,6},{64,91},{50,81},{35,44},{91,48},{21,37},{62,98},{64,26},{63,51},{77,55},{25,13},{60,41},{87,79},{75,17},{61,95},{30,82},{47,79},{28,7},{92,95},{91,59},{94,85},{24,65},{91,31},{3,9},{59,58},{70,43},{95,13},{30,96},{51,9},{16,70},{29,94},{37,22},{35,79},{14,90},{75,9},{2,57},{81,80},{61,87},{69,88},{98,79},{18,70},{82,19},{36,27},{49,62},{67,75},{62,77},{83,96},{92,37},{95,22},{46,97},{35,0},{44,79},{82,89},{68,94},{96,31},{92,34},{25,0},{46,36},{38,84},{21,0},{0,80},{72,44},{56,97},{86,26},{94,57},{25,6},{81,13},{66,63},{57,5},{72,49},{46,86},{95,16},{95,37},{14,89},{44,22},{60,39},{37,47},{58,86},{89,96},{38,83},{51,91},{72,70},{14,82},{60,30},{58,39},{57,22},{95,70},{44,76},{5,68},{15,69},{33,61},{81,32},{21,68},{73,20},{22,72},{83,8},{15,54},{93,42},{68,95},{55,72},{33,92},{5,49},{17,96},{44,77},{24,53},{2,98},{33,81},{32,43},{20,16},{67,84},{98,35},{58,11},{72,5},{3,59},{78,79},{6,0},{26,71},{96,97},{18,92},{1,36},{78,0},{63,15},{20,43},{32,73},{37,76},{73,16},{76,23},{50,44},{68,2},{14,86},{69,65},{95,98},{53,64},{6,76},{7,11},{14,84},{62,50},{83,58},{78,92},{37,0},{13,55},{12,86},{11,59},{41,86},{27,26},{94,43},{20,78},{0,73},{58,90},{69,36},{62,34},{65,26},{32,85}}, 20, 53));
//        System.out.println(validPath(100, new int[][] {{96,56},{6,96},{64,13},{40,39},{77,37},{84,77},{49,73},{16,24},{40,94},{71,95},{16,38},{10,36},{92,90},{44,33},{94,9},{44,90},{2,90},{93,69},{96,25},{29,86},{64,45},{91,14},{96,87},{4,62},{94,65},{18,96},{16,90},{5,12},{14,94},{0,3},{22,96},{49,96},{71,17},{63,17},{29,84},{33,90},{91,26},{15,74},{89,86},{8,48},{25,72},{55,96},{54,52},{75,48},{78,79},{90,38},{90,27},{50,25},{0,9},{60,15},{56,66},{31,55},{66,89},{3,72},{80,90},{1,90},{96,95},{49,70},{36,96},{96,70},{21,90},{84,91},{33,97},{90,42},{76,90},{67,96},{47,64},{90,86},{72,76},{59,90},{96,82},{21,63},{47,96},{33,24},{11,25},{44,14},{5,94},{19,34},{96,69},{88,60},{47,6},{74,83},{68,90},{96,93},{97,78},{31,74},{53,96},{63,59},{92,54},{94,35},{90,64},{72,96},{74,96},{15,96},{78,29},{37,57},{23,0},{37,90},{99,63},{96,85},{20,90},{90,54},{96,30},{90,98},{73,76},{66,90},{99,61},{95,30},{96,63},{52,97},{16,10},{96,4},{96,19},{16,96},{78,64},{8,62},{87,34},{64,26},{27,87},{81,90},{83,90},{19,74},{13,96},{80,64},{49,11},{31,90},{96,23},{96,41},{0,34},{72,75},{57,32},{15,91},{71,90},{96,92},{79,90},{97,48},{58,96},{96,17},{4,2},{51,91},{51,0},{61,79},{75,15},{95,89},{70,88},{57,0},{7,96},{8,90},{88,8},{39,96},{77,90},{46,90},{37,11},{88,14},{12,8},{96,12},{96,62},{45,18},{90,50},{8,97},{75,96},{38,53},{96,99},{89,96},{89,40},{34,73},{96,11},{94,3},{37,41},{90,3},{88,96},{94,32},{45,90},{43,12},{56,64},{73,7},{42,48},{83,9},{96,29},{81,12},{91,90},{90,28},{96,97},{44,79},{96,43},{27,21},{24,52},{68,18},{20,8},{34,7},{25,83},{58,6},{93,80},{16,0},{59,5},{21,78},{55,78},{60,96},{26,0},{44,99}}, 53,18));
    }

    // (validPath(10, new int[][] {{0,7},{0,8},{6,1},{2,0},{0,4},{5,8},{4,7},{1,3},{3,5},{6,5}}, 7, 5)
    //(validPath(6, new int[][] {{0,1},{0,2},{3,5},{5,4},{4,3}}, 0, 5));

//    {{0,1},{1,2},{2,0}}
//    {0,1},{0,2},{3,5},{5,4},{4,3}

    public static boolean validPath(int n, int[][] edges, int source, int destination) {

        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] edge : edges) {
            int a = edge[0], b = edge[1];
            if (!graph.containsKey(a)) {
                graph.put(a, new ArrayList<>());
                graph.get(a).add(b);
            } else graph.get(a).add(b);

            if (!graph.containsKey(b)) {
                graph.put(b, new ArrayList<>());
                graph.get(b).add(a);
            } else graph.get(b).add(a);
        }

        boolean[] seen = new boolean[n];
        seen[source] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(source);

        while (!queue.isEmpty()) {
            int currNode = queue.poll();
            if (currNode == destination) return true;

            for (int nextNode : graph.get(currNode)) {
                if (!seen[nextNode]) {
                    seen[nextNode] = true;
                    queue.offer(nextNode);
                }
            }
        }
        return false;
    }


//    public static boolean validPath(int n, int[][] edges, int source, int destination) {
//        //Store all edges in 'graph'.
//        Map<Integer, List<Integer>> graph = new HashMap<>();
//        for (int[] edge : edges) {
//            int a = edge[0], b = edge[1];
//            graph.computeIfAbsent(a, val -> new ArrayList<Integer>()).add(b);
//            graph.computeIfAbsent(b, val -> new ArrayList<Integer>()).add(a);
//        }
//
//        System.out.println(graph);
//        System.out.println(graph.get(7));
//
//        // Store all the nodes to be visited in 'queue'.
//        boolean[] seen = new boolean[n];
//        seen[source] = true;
//        Queue<Integer> queue = new LinkedList<>();
//        queue.offer(source); // add 0 to queue
//
//        System.out.println(queue);
//
//        while (!queue.isEmpty()) {
//            int currNode = queue.poll(); // current node is 0, 0 is removed from queue
//            System.out.println("looking at " + currNode);
//            if (currNode == destination) { // false
//                return true;
//            }
//
////            {0=[7, 8, 2, 4], 1=[6, 3], 2=[0], 3=[1, 5], 4=[0, 7], 5=[8, 3, 6], 6=[1, 5], 7=[0, 4], 8=[0, 5]}
//
//            System.out.println("currNode " + currNode + " is not destination node " + destination);
//            System.out.println("the queue is now " + queue);
//
//            // For all the neighbors of the current node, if we haven't visited it before,
//            // add it to 'queue' and mark it as visited.
//            for (int nextNode : graph.get(currNode)) { // get next node
//                System.out.println("next node in graph from current node " + currNode + " is " + nextNode);
//                if (!seen[nextNode]) { // if it hasn't been seen
//                    System.out.println(nextNode + " has not been seen, so it will be added to the queue");
//                    seen[nextNode] = true; // mark it as seen
//                    queue.offer(nextNode);
//                } else System.out.println(nextNode + " has been seen, so it will not be added to the queue");
//            }
//        }
//
//        return false;
//    }

//    public static boolean validPath(int n, int[][] edges, int source, int destination) {
//        boolean[] seen = new boolean[n];
//        return h(seen, edges, source, destination);
//    }

    public static boolean h (boolean[] seen, int[][] edges, int source, int destination) {

        if (source == destination) return true;

        for (int[] edge : edges) {
            if (edge[0] == source && !seen[edge[1]]) {
                seen[edge[0]] = true;
                if (h(seen, edges, edge[1], destination)) return true;
            } else if (edge[1] == source && !seen[edge[0]]) {
                seen[edge[1]] = true;
                if (h(seen, edges, edge[0], destination)) return true;
            }
        }
        return false;
    }

    //too slow
//    public static boolean validPath(int n, int[][] edges, int source, int destination) {
//        if (source == destination) return true;
//        int start = -1;
//        for (int i = 0; i < edges.length; i++) {
//            if (edges[i][0] == source || edges[i][1] == source) {
//                start = i;
//                break;
//            }
//        }
//        if (start == -1) return false;
//        Set<Integer> connections = new HashSet<>();
//        connections.add(edges[start][0]);
//        connections.add(edges[start][1]);
//        int i = start;
//        int c = 0;
//        while (c < n) {
//            if (connections.contains(edges[i][0]) || connections.contains(edges[i][1])) {
//                connections.add(edges[i][0]);
//                connections.add(edges[i][1]);
//                c++;
//            }
//            i++;
//            if (i == edges.length) i = 0;
//        }
//        return connections.contains(source) && connections.contains(destination);
//    }


    // too slow
//    static ArrayList<Integer> visited = new ArrayList<>();
//
//    public static boolean validPath(int n, int[][] edges, int source, int destination) {
//
//        if (source == destination) return true;
//
//        for (int[] edge : edges) {
//            if (edge[0] == source && !visited.contains(edge[1])) {
//                visited.add(source);
//                if (validPath(n, edges, edge[1], destination)) return true;
//            } else if (edge[1] == source && !visited.contains(edge[0])) {
//                visited.add(source);
//                if (validPath(n, edges, edge[0], destination)) return true;
//            }
//            visited.remove(Integer.valueOf(source));
//        }
//        return false;
//    }

}