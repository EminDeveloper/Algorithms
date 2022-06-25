package quickunion;

public class Main {

    public static void main(String[] args) {
        quickunion.QuickUnionUF q = new quickunion.QuickUnionUF(5);

        Boolean result = q.connected(2, 2);
        System.out.println("Hello " + q.connected(1, 2));
    }
}
