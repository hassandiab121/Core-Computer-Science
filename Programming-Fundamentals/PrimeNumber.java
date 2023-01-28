import java.util.Scanner;
public class PrimeNumber 
{
   public static void main(String args[])
   {
       // to find if it a prime number 
       
     Scanner sc= new Scanner(System.in);
     int number=sc.nextInt();
   //  int[] array=new int[number];
   boolean falge =false;
     for (int i = 1; i<=number; i++)
     {
         for (int z = 1; z<=number;z++)
         {
           if ( z%2!=0 && ( (i%z!=0 && z!=i) || (i%z==0 && z==i))  && z%7==0)
           {
               System.out.print("Yes");
               falge=true;
               break;
           }
           else if(i==number && z==number)
               System.out.print("NO");

         }
         if (falge == true )
             break;
     }
   }
   
   
}
