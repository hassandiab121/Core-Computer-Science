package problemsolving;

import java.util.Scanner;

public class SnackTower {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] snacksSize = new int[input.nextInt()];
        boolean[] visited = new boolean[snacksSize.length + 1];

        for (int index = 0; index < snacksSize.length; index++) {
            snacksSize[index] = input.nextInt();
        }
        int n = snacksSize.length;
        for (int index = 0; index < snacksSize.length; index++) {
            visited[snacksSize[index]] = true;
            while (visited[n]) {
                System.out.print(n + " ");
                n--;
            }
            System.out.print("\n");
        }

    }
}