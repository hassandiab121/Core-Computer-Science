package problemsolving;



import java.util.Scanner;

public class ColorfulStone {
    public static void main(String[] ags ){
        Scanner input = new Scanner(System.in);

        String coloredStone = input.nextLine();// read until new line
        String instruction = input.nextLine();

        int lissPos = 0;
        for ( int instruc=0; instruc<instruction.length() &&  lissPos < coloredStone.length(); instruc++ )
        {
            if (coloredStone.charAt(lissPos) == instruction.charAt(instruc))
               lissPos++;
        }
        if (coloredStone.length() > lissPos)
            lissPos++;// RR RR
        System.out.println(lissPos);
    }
}
