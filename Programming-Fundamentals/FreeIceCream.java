package problemsolving;

import java.util.Scanner;

public class FreeIceCream {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int ditressedChild = 0;


        int queueSize = input.nextInt();
        long packsNum = input.nextLong();
        char plusOrMins ;
        long packs  ;

        for (int counter = 1; counter <= queueSize; counter++) {
            plusOrMins = input.next().charAt(0);
            packs = input.nextLong();
            if (plusOrMins == '+')
                packsNum = packsNum + packs;
            else if(packsNum >= packs)
                packsNum = packsNum -packs;
            else
                ditressedChild++;

        }
        System.out.println(packsNum +" "+ ditressedChild);
    }
}
