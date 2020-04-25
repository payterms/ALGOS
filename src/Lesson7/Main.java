package Lesson7;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(10);

        /*
        *     1 ----- 4
        *   /   \      \
        * 0 - 2 -5 -7 - 9
        *   \   \  /   /
        *     3 -6 -- 8
        * */
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(0,3);

        graph.addEdge(1,4);
        graph.addEdge(1,5);

        graph.addEdge(2,5);
        graph.addEdge(2,6);

        graph.addEdge(3,6);

        graph.addEdge(4,9);

        graph.addEdge(5,7);

        graph.addEdge(6,7);
        graph.addEdge(6,8);

        graph.addEdge(7,9);

        graph.addEdge(8,9);

        BreadthFirstPath bfp = new BreadthFirstPath(graph, 0);
        System.out.println(bfp.hasPathTo(4));
        System.out.println(bfp.hasPathTo(8));
        System.out.println(bfp.pathTo(9));

    }
}
