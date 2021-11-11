package lesson7;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(10);
        graph.addEdge(0, 6);
        graph.addEdge(0, 7);
        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(1, 8);
        graph.addEdge(1, 9);
        graph.addEdge(1, 2);
        graph.addEdge(8, 3);
        graph.addEdge(3, 4);
        graph.addEdge(5, 3);
        graph.addEdge(5, 2);

        FirstPaths bfp = new BreadthFirstPaths(graph, 0);
        System.out.println(bfp.hasPathTo(4));
        System.out.println(bfp.pathTo(4));

        FirstPaths dfp = new DepthFirstPaths(graph, 0);
        System.out.println(dfp.hasPathTo(4));
        System.out.println(dfp.pathTo(4));
        System.out.println("Shortest path: " + Math.min(bfp.pathTo(4).size(), dfp.pathTo(4).size()));
    }
}
