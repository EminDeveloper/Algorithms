package quickunion;

public class QuickUnionUF
{
    private int[] id;

    public QuickUnionUF(int N)
    {
        id = new int[N];
        for (int i = 0; i < N; i++) id[i] = i;
    }
    private int root(int i)
    {
        while (i != id[i]) i = id[i];
        return i;
    }
    public boolean connected(int p, int q)
    {
        return root(p) == root(q);
    }

    public void union(int p, int q)
    {
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }
}


/*  Algorithm   init union find
         quick-find  N    N     1

         DEFECT: Union too expensive!
         COST: Takes N^2 array accesses to process sequence of N union commands on N objects.

        Integer array id[] of size N
        Interpretation: p and 1 are connected iff they have the same id:

              0  1  2  3  4  5  6  7  8  9    0, 5 and 6 are connected
         id[] 0  1  1  8  8  0  0  1  8  8    1, 2 and 7 are connected
                                              3, 4, 8 and 9 are connected
           0  1--2  3--4
           |     |  |  |
           5--6  7  8  9

         FIND: Check if p and q have the same id.

         UNION: To merge components containing p and q, change all
                entries whose id equals id[p] to id[q]

         union(6, 1):
                   0  1  2  3  4  5  6  7  8  9
         WAS: id[] 0  1  1  8  8  0  0  1  8  8
         NOW: id[] 1  1  1  8  8  1  1  1  8  8
                   X  .  .  .  .  X  X  .  .  .

         THis is a problem when we have a huge number of objects
         because we have a lot of values to change.  But it is
         easy to implement.

         COST MODEL.	Number of array accesses (for read or write)
         Order of growth of number of array accesses

                    init union find
         quick-find    N    N    1

         QUICK-FIND DEFECT: Union too expensive

         EX. N union commands on N objects takes N^2 (Quadratic)
         array accesses to process the sequence of N objects.

         AS COMPUTERS GET FASTER AND BIGGER, QUADRATIC ALGORITHMS GET SLOWER.

         Today people have computers that can run billions of operations per second
         and they have billions of entries in main memory.
         => Can touch everything in main memory in about a second
         True for the last 50-60 years; Computers get bigger, but they get faster
         True then when computers had a few thousand words of memory
         True now  when computers have millions or more

         QUADRATCIC ALGORITHMS DO NOT SCALE

         ROUGH STANDARD (FOR NOW).
         * 10^9 operations per second.
         * 10^9 words of main memory.
         * Touch all words in approximately 1 second (a truism since 1950!)

         EX. HUGE PROBLEM FOR QUICK-FIND
         * 10^9 union commands on 10^9 objects
         * Quick-find takes more tha 10^18 operations.
         * 30+ years of computer time!

         Ex: Takes N^2 accesses to process sequence of N union commands on N objects.
         QUADRATIC ALGORITHMS ARE UNEXCEPTABLY SLOW AND DO NOT SCALE WITH TECHNOLOGY: 08:50
           * New computer may be 10x as fast
           * But, has 10x as much memory =>
             want to solve a problem that is 10x as big.
           * With quadratic algorithm, takes 10x as long!!

         QUESTION: The maximum number of ID[] array entries that can change (from one
         integer to a # different integer) during one call to union when using the
         quick-find data structure on N elements?
         ANSWER: N - 1
         EXPLANATION: In the worst case, all of the entries except id[q] are
         changed from id[p] to id[q]

          Copyright 2002-2016, Robert Sedgewick and Kevin Wayne.
          Copyright 2015-2019, DV Klopfenstein, Python implementation
*/