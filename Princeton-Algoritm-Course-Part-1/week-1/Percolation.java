

import edu.princeton.cs.algs4.WeightedQuickUnionUF;



public class Percolation {
    private final int sizeOfGrid;
    private int numberOfSites = 0;
    private boolean[] openOrNot;
    private WeightedQuickUnionUF union;



    // creates n-by-n grid, with all sites initially blocked
    public Percolation (int n) {
     sizeOfGrid = n;
     if (n <= 0)
         throw new IllegalArgumentException();
     else {
         union = new WeightedQuickUnionUF(n * n + 2);
         openOrNot = new boolean[n * n + 1];
         for (int i = 1; i <= n; i++) {
             union.union(0, i);
             if(n != 1)
                union.union(n * n + 1, xyTo1D(n, i));
         }
     }
    }


    // opens the site (row, col) if it is not open already
    public void open (int row , int col) {
        if(!openOrNot[ xyTo1D(row, col) ])
        {
            openOrNot[ xyTo1D(row, col) ] = true;
            numberOfSites++;
            if( openOrNot.length==2)
                union.union(xyTo1D(1,1),sizeOfGrid*sizeOfGrid+1);
        }

        if ((1<= row && row<=sizeOfGrid-1) && isOpen(row+1, col) ) // to check if the down site is open
          /*  if(row == sizeOfGrid-1 && union.find(xyTo1D(row, col)) == 0)
                union.union(xyTo1D(row, col), xyTo1D(row+1, col));
            else*/
                union.union(xyTo1D(row, col), xyTo1D(row+1, col));// connect to  down (it is open )

        if ((2<= row && row<=sizeOfGrid) && isOpen(row-1, col )   ) // to check if the up site is open
          {
             /* if(row == sizeOfGrid && union.find(xyTo1D(row-1, col)) == 0)
                 union.union(xyTo1D(row, col), xyTo1D(row - 1, col));
              else*/
                  union.union(xyTo1D(row, col), xyTo1D(row - 1, col));// connect to up (it is open )
          }



        if ((1<= col && col<=sizeOfGrid-1)  &&  isOpen(row, col+1)  ) // to check if the right site is open

            union.union(xyTo1D(row, col), xyTo1D(row , col+1));// connect to right (it is open )


        if ((2<= col && col<=sizeOfGrid)  &&  isOpen(row, col-1)  ) // to check if the left site is open

            union.union(xyTo1D(row, col), xyTo1D(row , col-1)); // connect to left (it is open )

        }


    // is the site (row, col) open?
    public boolean isOpen(int row, int col) {
        return openOrNot[xyTo1D(row, col)];
    }


    // is the site (row, col) full?
    public boolean isFull(int row, int col) {
        //check toward the up site

           return openOrNot[xyTo1D(row, col)]   &&   union.connected(xyTo1D(row, col), 0);
    }


    // returns the number of open sites
    public int numberOfOpenSites(){
        return numberOfSites;
    }


    // does the system percolate?
    public boolean percolates(){
        return union.find(0) == union.find(sizeOfGrid*sizeOfGrid+1);

    }


    private int xyTo1D(int row, int col) {
             if (row < 1 || col < 1 || row >sizeOfGrid || col > sizeOfGrid)
                 throw new IllegalArgumentException();
             else
                 return sizeOfGrid * (row - 1) + col;

    }


    /*public void findRoot(){
        System.out.println(union.find(xyTo1D(1,6)) +" "+ union.find(xyTo1D(6,6)));
    }*/

    public static void main (String[] args){


    }

}

