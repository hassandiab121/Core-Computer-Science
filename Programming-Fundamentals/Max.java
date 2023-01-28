package problemsolving;
import java.util.Scanner;
  
// i am very happy to do this accepted
public class Max {
    public static void main (String args[])
    {
       
        int arraySize=0;
    
    Scanner input = new Scanner(System.in);
    arraySize =input.nextInt();
    int[] array = new int[arraySize];
    
       // fill array
      for (int x =0 ; x<array.length; x++)
      {
      array[x]=input.nextInt();
      }
      
      
      
      // in case of array have one value so it wiil be the answer
      if (array.length==1)
          System.out.print(array[0]);
      
      else
          
      {
            int z = 1;
            int i = 0;
      
        
           for ( ;i<array.length || (z)<array.length;)

             {

                // to leave from loop if we rach to the end of array 
             if (z==(array.length)-1 || i==(array.length)-1)  

                      break;


               // to move to second iteration in case of equals  
            if (array[i]==array[z])
                   {
                     i++;                      
                    continue;
                    }
           


             if (array[z]>array[i])
                   i++;
               else
                   z++;

             }
           
         if (array[i]<array[z])
              {
               System.out.print("\n"+array[z]);
              }  
        else
              {
               System.out.print("\nf"+array[i]);
              }
           
          

        
     }
      
      
   
   }

}
