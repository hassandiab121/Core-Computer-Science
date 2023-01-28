package problemsolving;


import java.util.Scanner;

public class Oath_Of_TheNights_Watch {
   static Scanner input = new Scanner(System.in);
    public static void main(String[] args){

        int[] stewards = new int[input.nextInt()];

        if (stewards.length < 3 )
            System.out.println(0);
        else {
            input(stewards);

            if (max(stewards) == min(stewards))
                System.out.println(0);
            else
                System.out.println(stewards.length -2 - minEquals(stewards) - maxEquals(stewards));

        }

    }

    static void input(int[] x)
    {
        for (int i = 0; i < x.length; i++)
        {
            x[i] = input.nextInt();
        }
    }

    static int max(int[] x)
    {
        int max = x[0];

        for (int i : x)
            if (i > max)
                max = i;

        return max;
    }
    static int min(int[] x){
        int min = x[0];

        for (int i : x)
            if (i < min)
                min = i;

        return min;
    }

    static int minEquals(int[] x){
        int min = min(x);
        int numberOfEquals = -1;

        for (int i : x)
            if (i == min)
                numberOfEquals++;

        return numberOfEquals;
    }

    static int maxEquals(int[] x){
        int max = max(x);
        int numberOfEquals = -1;

        for (int i : x)
            if (i == max)
                numberOfEquals++;

        return numberOfEquals;
    }

}
