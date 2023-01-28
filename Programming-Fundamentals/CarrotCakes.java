package problemsolving;

import java.util.Scanner;

public class CarrotCakes {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numOfCake = input.nextInt();
        int time = input.nextInt();
        int cakesPerT = input.nextInt();
        int bultTime = input.nextInt();
        int[] readyCake = new int[2];
        int timeBeforeUs2 = 0,timeAfterUs2 =0;
        for (int round = 1;readyCake[0] < numOfCake || readyCake[1] < numOfCake ;round++)
        {
            if( readyCake[0] < numOfCake ) {
                timeBeforeUs2 = timeBeforeUs2 + time;
                readyCake[0] = readyCake[0] + cakesPerT;
            }
            if(readyCake[1] < numOfCake) {
                timeAfterUs2 =  bultTime + time;
                readyCake[1] = round * cakesPerT + (timeAfterUs2/time) * cakesPerT ;

            }
        }
        if (timeBeforeUs2 > timeAfterUs2)
            System.out.println("YES");
        else
            System.out.println("NO");



    }
}
