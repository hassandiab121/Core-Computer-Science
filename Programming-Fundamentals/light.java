package problemsolving;

import java.util.Scanner;

 class light {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        long divisible ;
        long corridorLambs;


        while ( (corridorLambs = input.nextLong() )!= 0 )
        {
            divisible = (long) Math.sqrt(corridorLambs);

            System.out.println( divisible * divisible == corridorLambs? "yes": "no");


        }


    }
}
