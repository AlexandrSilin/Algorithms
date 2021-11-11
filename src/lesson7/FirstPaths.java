package lesson7;

import java.util.LinkedList;

public abstract class FirstPaths {
    protected boolean[] marked;
    protected int[] edgeTo;
    protected int source;

    public FirstPaths(Graph g, int source) {
        this.source = source;
        marked = new boolean[g.getVertexCount()];
        edgeTo = new int[g.getVertexCount()];
        findPath(g, source);
    }

    protected abstract void findPath(Graph g, int v);

    public boolean hasPathTo(int dist) {
        return marked[dist];
    }

    public LinkedList<Integer> pathTo(int dist) {
        if (!hasPathTo(dist)) {
            return null;
        }
        LinkedList<Integer> stack = new LinkedList<>();
        int vertex = dist;
        while (vertex != source) {
            stack.push(vertex);
            vertex = edgeTo[vertex];
        }
        return stack;
    }
}
