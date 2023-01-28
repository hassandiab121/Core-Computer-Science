
package problemsolving;
import java.util.Scanner;

/**
 *
 * @author Hassan Diab
 */

public class NewClass {
    

  public static void main(String args[])
    {
        int determined=0;
        int consumptions=0; 
        int numberOfCases;   
        Scanner sc =new Scanner(System.in);
        numberOfCases=sc.nextInt();
       int[][] arr=new int[numberOfCases][4];

       for(int row=0 ;row<numberOfCases ;row++)
       {

           for(int colums=0 ;colums<4 ;colums++)
           {

           arr[row][colums]=sc.nextInt();
           }

       }
       
       for(int i = 0 ;i<numberOfCases ;i++)
       {
           arr[i][0]= arr[i][0]+1;
           System.out.println("new day = "+arr[i][0]);
        if(arr[i][1] == 2 && arr[i][0]>28)
        {
         arr[i][1]++;
         arr[i][0]=1;
        }
        switch(check31(arr[i][1]))
         {
            case 1:
                if(arr[i][0]>31)
                {
                arr[i][1]++;
                arr[i][0]=1;
                }
                break;
                
            case 0: 
               if(arr[i][0]>30)
                {
                arr[i][1]++;
                arr[i][0]=1;
                }
                break;                
         }
        
        
        if(arr[i][1]>12)
            {
            arr[i][1]=1;
            arr[i][2]++;
            } 
        
        if(arr[i][0] == arr[i+1][0] && arr[i][1] == arr[i+1][1]  &&  arr[i][2] == arr[i+1][2])
            {
            System.out.print(arr[i+1][0]+" "+arr[i+1][1]+" "+arr[i+1][2]);
            determined++;
            consumptions=consumptions+(arr[i+1][3]-arr[i][3]);
            }
        
        if(i==numberOfCases-2)
            break;
       }
       
       System.out.print(determined+" "+consumptions);
        
    
    }
    
    
      
   
    static int check31(int x){
    
    if(x == 1 || x == 3 || x == 5 || x == 7 || x == 8 || x == 10 || x == 12)
        return 1;
    else
        return 0;
    }
    
}
