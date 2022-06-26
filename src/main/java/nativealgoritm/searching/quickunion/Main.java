package quickunion;

import nativealgoritm.searching.quickunion.QuickFindUF;

public class Main {

    public static void main(String[] args) {

        QuickFindUF qf = new QuickFindUF(6);

        qf.union(0, 1);
        qf.union(2, 5);
        qf.union(4, 5);
        qf.union(3, 4);
        qf.union(2, 4);

        System.out.println(qf.connected(4, 3));

    }

}
