package nativealgoritm.searching.quickunion;

public class QuickFindUF {
    int[] id;
    int[] sz;

    public static void main(String[] args) {
        QuickFindUF qf = new QuickFindUF(6);
        qf.union(0, 1);
        qf.union(2, 5);
        qf.union(4, 5);
        qf.union(3, 4);
        qf.union(2, 4);
        System.out.println(qf.connected(4, 3));
    }

    QuickFindUF(int N) {
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