package problemsolving;
import java .util.Scanner;
public class FixedPass 
{
    static int arraySize=0;
  public static void main (String args[])
  
  {
     Scanner input =new Scanner(System.in);
      int testNumber;
      
      for(int i=0 ; i<1000; i++)
      {
      testNumber=input.nextInt();
      if(testNumber==1999)
          break;
      else 
          arraySize++;
      }
      
      String[] array =new String[arraySize];
      for (int counter =0 ; counter<=array.length; counter++)
      {
      if (counter<(array.length)-2)
         {
          array[counter]="Wrong";
          System.out.println("Wrong");
         }
      else
         {
         array[counter]="Correct";
         System.out.println("Correct");
         }
      }
     
  
  }

}
