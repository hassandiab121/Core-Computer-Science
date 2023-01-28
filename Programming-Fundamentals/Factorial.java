package problemsolving;
import java.util.Scanner;

public class Factorial {
    
   public static void main(String args [])
    {
     int arraySize=0;
  Scanner sc=new Scanner(System.in);
  arraySize=sc.nextInt();             // number of test cases
  int[] array = new int[arraySize];    // array for store test cases
    int counter =0; 
  for ( ; counter<array.length ; counter++)
    {
       array[counter]=sc.nextInt();            // for loop for fill array
    }
  
  long[] factorialNum=new long[arraySize];  // array for store the factorial of each test case
  long factorial=1;      
  for (int i =0 ;i<array.length;i++ )
      {
          if(array[i]==1 || array[i]==0)
            {
             factorialNum[i]=1;
            }
         else
          factorial=1;    // to make factorial variable = 1 at every iteration 
          for (;array[i]>1;)
          {
         factorial=factorial* array[i];
           factorialNum[i]=factorial;      //nessted loop to find factorial of each test case
           array[i]=array[i]-1;
           
          }
           

      }
  
            for( int x=0; x<factorialNum.length;x++)
            {
              System.out.println(factorialNum[x]);  // print the factorial of tst case
            }
    
    }    
}

