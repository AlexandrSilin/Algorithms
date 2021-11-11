package lesson7;

public class DepthFirstPaths extends FirstPaths {

    public DepthFirstPaths(Graph g, int source) {
        super(g, source);
    }

    @Override
    protected void findPath(Graph g, int v) {
        marked[v] = true;
        for (int w : g.getAdjList(v)) {
            if (!marked[w]) {
                edgeTo[w] = v;
                findPath(g, w);
            }
        }
    }
}
