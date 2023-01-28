package problemsolving;

import java.util.Scanner;

public class ShaassAndOskols {
    public static  void main (String[] args) {
        int wirePos,birdPos;
        Scanner input = new Scanner(System.in);
        int[] wire = new int[input.nextInt()];
        for (int i = 0; i< wire.length; i++)
        {
            wire[i] = input.nextInt();
        }
        int shoots = input.nextInt();
        for (int counter = 1; counter <= shoots; counter++)
        {
            wirePos = input.nextInt();
            birdPos = input.nextInt();

            if(wirePos >= 2)
              wire[wirePos-2] = wire[wirePos-2] +birdPos -1;
            if(wirePos <= wire.length-1)
              wire[wirePos] = wire[wirePos] + (wire[wirePos-1] - birdPos);

            wire[wirePos-1] = 0;
        }
        for (int i = 0; i< wire.length; i++ ){
            System.out.println(wire[i]);

        }
    }
}
