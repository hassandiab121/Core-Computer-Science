package problemsolving;

import java.util.Scanner;

public class LongestUncommonSubsequence {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name1 = input.nextLine();
        String name2 = input.nextLine();

        if (name1.equals(name2))
            System.out.println(-1);

        else if (name1.length() != name2.length())
            System.out.println(name1 .length() > name2.length()? name1.length() : name2.length());

        else
         {
             for (int index = name1.length() ; index >= 0; index--)
             {
                 if ( !name1.contains(name2.substring(0,index)))
                 {
                     System.out.println(index);
                     break;
                 }
                 if (!name2.contains(name1.substring(0,index)))
                 {
                     System.out.println(index);
                     break;
                 }
             }
         }
    }
}
