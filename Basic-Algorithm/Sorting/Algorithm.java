/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;


import java.util.Random;

/**
 *
 * @author Hassan Diab
 */
public class Algorithm {

    /**
     * @param args the command line arguments
     */
    public static  void main(String[] args) {
        // TODO code application logic here
        Random r = new Random();

        String number = "011";
        String x = "0123456789";
        for (int z = 1 ; z < 100; z++) {
            for (int i = 1; i < 9; i++) {
                number = number + x.charAt(r.nextInt(9));
            }

            System.out.println(number);
            number = "011";
        }
    }



}
