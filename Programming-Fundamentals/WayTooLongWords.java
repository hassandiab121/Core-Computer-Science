package problemsolving;

import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numOfWords = input.nextInt();
        String word;
        for (int i = 1; i <= numOfWords; i++) {
             word = input.next();
            if (word.length() <= 10)
                System.out.println(word);
            else
                System.out.println(word.substring(0, 1) + (word.length() - 2) + word.charAt(word.length() - 1));
        }
    }
}
