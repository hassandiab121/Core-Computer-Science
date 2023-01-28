import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;

public class PercolationStats {
    private  Percolation p;
    private  double[] percolationThreshold;



    public PercolationStats(int n, int trials){
         if (trials <= 0)
             throw new IllegalArgumentException();
         else
         {

             setPercolationThreshold(trials);
             for (int counter = 1; counter <= trials; counter++)
             {
                 p = new Percolation(n);
              while (!p.percolates())
               {

                   p.open( StdRandom.uniform(1,n+1), StdRandom.uniform(1,n+1) );
               }
                 percolationThreshold[counter-1]=( (double) p.numberOfOpenSites() )/(n*n);

             }
         }
    }


    public double mean(){
     return StdStats.mean(percolationThreshold);
    }


    public double stddev(){
        return StdStats.stddev(percolationThreshold);
    }


    public double confidenceLo(){
        return mean()-(1.96*stddev()/Math.sqrt(percolationThreshold.length));
    }


    public double confidenceHi(){
        return mean()+(1.96*stddev()/Math.sqrt(percolationThreshold.length));
    }


    private void setPercolationThreshold(int trials){
        percolationThreshold =new double[trials];
    }

    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
     PercolationStats p1 = new PercolationStats(n,trials);

     System.out.println("mean                    = "+p1.mean());
     System.out.println("stddev                  = "+p1.stddev());
     System.out.println("95% confidence interval = ["+p1.confidenceLo()+", "+p1.confidenceHi()+"]");

    }
}
