import java.util.Scanner;
public class toN 
{
    public static void main(String args[])
    {
       
    Scanner input =new Scanner(System.in);
    int numberOfElements = input.nextInt();
    int min=0,max=0;
    int[] cities = new int[numberOfElements];
        for(int i = 0 ;i<numberOfElements ;i++)
        {
         cities[i] = input.nextInt();
        }
        
        for(int z = 0 ;z<numberOfElements ;z++)
        {
         int current=cities[z];
         for(int x = 0 ;x<numberOfElements-1 ;x++)
          {
           min=Math.abs(current-cities[x]);    
          if(Math.abs(current-cities[x+1])<min && min!=0 && cities[x]!=current)
              min=Math.abs(current-cities[x+1]);
          
          else if(Math.abs(current-cities[x+1])>max && min!=0 && cities[x]!=current)
              max=Math.abs(current-cities[x+1]);
          }
         
        System.out.println(min+" "+max);
        }
    }
    
}
