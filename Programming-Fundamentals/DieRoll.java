package problemsolving;

import java.util.Scanner;

public class DieRoll {
    public  static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int[] dieRoll = new int[2];
        dieRoll[0] = input.nextInt();
        dieRoll[1] = input.nextInt();

        int denominator = 6;
        int res = 7 - max(dieRoll);

        for(int i = 2; i <= 4; i++ )
        {
            if(res % i == 0  &&  denominator % i == 0)
            {
              res = res / i;
              denominator =denominator / i;
              break;
            }
        }

        System.out.print(check(res,denominator));

    }
    public static int max(int[] x){

        if(x[0]>x[1])
            return x[0];

        return x[1];
    }
    public static String check(int x, int y){
        if (x == y)
            return "1";
        return x +"/"+y;
    }
}
