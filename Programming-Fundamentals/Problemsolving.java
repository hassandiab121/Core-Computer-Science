
package problemsolving;
import java.util.Scanner;
public class Problemsolving 
{
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);
        long  number =sc.nextLong();
//        int thePower =0;
//        while ( Math.pow(2, thePower)<number)  // check with repeat 
//        {
//     
//         thePower=thePower+1;
//        }
//
//       
//        if(Math.pow(2, thePower)==number)
//            System.out.println("Yes");
//        else
//            System.out.println("No");
System.out.print(getPower(number));
    }
static boolean  getPower(long number)
 {
 return( (number!=0 )&&((number & number-1)==0) );
 }

    
}
