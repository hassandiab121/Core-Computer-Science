package problemsolving;

import java.util.Scanner;

public class Juicer {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int orange = input.nextInt();
        int juicerMaxS = input.nextInt();
        int wasteSec = input.nextInt();
        int totalWaste =0;
        int numberOfEmpty = 0;
        int oran;
        for (int x = 0; x <orange; x++)
        {
            oran = input.nextInt();

            if (oran <= juicerMaxS)
                totalWaste = totalWaste + oran;

            if (totalWaste > wasteSec) {
                numberOfEmpty++;
                totalWaste = 0;
            }
        }

        System.out.println(numberOfEmpty);
    }
}
