/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemsolving;
import java.util.Scanner;
/**
 *
 * @author Hassan Diab
 */
public class BuyShovel {
    public static void main(String args[])
    {
    boolean iteration=true;
    Scanner sc=new Scanner(System.in);
    int PriceOfShovel = sc.nextInt();
    int denomination  = sc.nextInt();
    
    for(int i=1 ;iteration==true ;i++)
    {
        if ( (PriceOfShovel*i)%10==denomination ||(PriceOfShovel*i)%10==0 )
          {
           System.out.print(i);
           iteration=false;
          }
    }
    
    }
    
}
