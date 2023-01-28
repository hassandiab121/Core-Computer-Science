package problemsolving;

import java.util.Scanner;

public class AntonAndLetters {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String set = input.nextLine();
        set = set.substring(1, set.length()-1);
        int length =( (set.length()-1) / 3) + 1;
        String equals = "";
        for (int index = 0; index < length && set.length()>=1; index++)
        {
            String check =""+ set.charAt(mapIndex(index,set.length()));

            if (!equals.contains(check))
                equals = equals +set.charAt(mapIndex(index,set.length()));

        }


            System.out.println(equals.length());

    }
    public static int mapIndex(int index ,int length){
        int result = index + index * 2;
        return result <= length-1 ? result : result-3;
    }
}
