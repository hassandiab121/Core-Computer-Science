package problemsolving;

import java.util.Scanner;

public class UniformGenerator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int step = input.nextInt();
        int mod = input.nextInt();
        int seed_x = 0;
        int seed_X= 1; // seed_x+1
        int numbers[] = new int[mod];
        int counter = 0;

        while (counter < mod)
        {

            seed_X = (seed_x + step ) %mod;
            numbers[counter]=seed_X;
            seed_x = seed_X;
            counter++;
        }
        if(repeat(numbers))
            System.out.println("\t"+step+"\t  "+mod+"\tbad choice");
        else
            System.out.println("\t"+step+"\t  "+mod+"\tgood choice");
    }
    public static boolean repeat(int[] x)
    {
        for (int i=0;i<x.length;i++)
        {


            for (int z=i+1;z<x.length;z++)
            {
                if (x[i] == x[z])
                {
                    return true;

                }
            }
        }
        return false;
    }
}
