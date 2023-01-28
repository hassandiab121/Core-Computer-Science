import java.util.Scanner;
public class typeOfNumber 
{
    public static void main(String args[])
    {
        Scanner input =new Scanner(System.in);
    int arraySize ,even=0 ,odd=0 ,positive=0 ,negative=0;
   
    arraySize=input.nextInt();
     int[] array= new int[arraySize]; 
     
     for(int counter =0 ; counter<array.length;counter++ )
     {
     array[counter]=input.nextInt();
     }
     
     for(int counter =0 ; counter<array.length;counter++ )
      {
      if (array[counter]%2==0)
          even++;
      else
          odd++;
      
      if(array[counter]>0)
          positive++;
      else if(array[counter]!=0)
          negative++;
      }
     
     System.out.println("Even: "+even);
     System.out.println("Odd: "+odd);
     System.out.println("Positive: "+positive);
     System.out.println("Negative: "+negative);
     
    }
}
