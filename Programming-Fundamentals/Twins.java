package problemsolving;

import java.util.Arrays;
import java.util.Scanner;

public class Twins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] coins = new int[input.nextInt() + 1];
        int sumOfCoins = 0;
        for (int counter = 1; counter < coins.length; counter++ )
        {
            coins[counter] = input.nextInt();
            sumOfCoins = sumOfCoins + coins[counter];
        }
        Arrays.sort(coins);
        System.out.println(minNumOfCoin(coins,sumOfCoins));

    }
 public static int minNumOfCoin(int[] x, int sums)
   {
       int minimumNumberOfCoins = 0;
       int counter = x.length - 1;
       while (minimumNumberOfCoins <= (sums - minimumNumberOfCoins)  )
       {
           minimumNumberOfCoins = minimumNumberOfCoins + x[counter];
           counter--;
       }
       return  (x.length - 1) - counter;
   }
}
