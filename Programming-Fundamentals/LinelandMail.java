package problemsolving;

import java.util.Scanner;

public class LinelandMail {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numberOfCities = input.nextInt();
        int[]cities = new int[numberOfCities];
        int min = 0, max = 0 ;
        for (int counter = 0; counter < cities.length; counter++)
        {
            cities[counter] = input.nextInt();
        }
        for (int index = 0; index < cities.length; index++)
        {
            if(index == 0)
            {
                min = Math.abs(cities[index+1] - cities[index]);
                max = Math.abs(cities[index] - cities[cities.length - 1]);
            }

            if ( (index == cities.length -1))
            {
                min = min = Math.abs(cities[index] - cities[index - 1]);
                max = Math.abs(cities[index] - cities[0]);
            }

            else if(index > 0 && index < cities.length -1)
            {
                min = Math.min(Math.abs(cities[index] -cities[index + 1]), Math.abs(cities[index] - cities[index-1] ));
                max = Math.max(Math.abs(cities[index] -cities[cities.length-1]), Math.abs(cities[index] - cities[0]));
            }
            System.out.println(min + " " + max);
        }
    }
}
