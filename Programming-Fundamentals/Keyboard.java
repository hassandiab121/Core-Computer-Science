package problemsolving;

import java.util.Scanner;

public class Keyboard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char character = input.next().charAt(0);
        String word = input.next();
        String keyboard = "qwertyuiopasdfghjkl;zxcvbnm,./";
        for (int counter = 0; counter < word.length(); counter++)
        {
            int index = keyboard.indexOf(word.charAt(counter));
            if (character == 'R')
                System.out.print(keyboard.charAt( index - 1));
            else
                System.out.print(keyboard.charAt( index + 1));
        }

    }
}
