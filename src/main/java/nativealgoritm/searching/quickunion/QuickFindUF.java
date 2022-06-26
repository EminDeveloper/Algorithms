package nativealgoritm.searching.quickunion;

public class QuickFindUF {

    int[] id;
    int[] sz;

    public QuickFindUF(int N) {
        id = new int[N];
        sz = new int[N];

        for (int i = 0; i < N; i++) {
            id[i] = i;
            sz[i] = 1;
        }
    }

    private int root(int i) {
        while (i != id[i]) {
            i = id[i];
            id[i] = id[id[1]];
        }
        return i;
    }

    public boolean connected(int p, int q) {
        return (root(p) == root(q));
    }

    public void union(int p, int q) {

        int p_root = root(p);
        int q_root = root(q);

        if (sz[p_root] > sz[q_root]) {
            id[q_root] = p_root;
            sz[p_root] += sz[q_root];
        } else {
            id[p_root] = q_root;
            sz[q_root] += sz[p_root];
        }
    }
}