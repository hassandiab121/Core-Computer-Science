package problemsolving;

import java.util.Scanner;

public class TesteCase {
     public static void main(String args[])
     {
      Scanner sc = new Scanner(System.in);
      int numberOfProblems = sc.nextInt();
      int numberOfZeros = 0;
      int solution = 0;
      int[] problems =new int[3];
      
      for(int counter = 0; counter < numberOfProblems; counter++) // iteration on the problem 
      {
        for(int i = 0; i < problems.length; i++) // three iteration with th test of find zero 
        {
         problems[i] = sc.nextInt();
         if(problems[i] == 0)
             numberOfZeros++;
        }
        
        if (numberOfZeros <= 1)
           solution++; 
        
        numberOfZeros =0;
         
      }
      System.out.print(solution);
     }
  
     }
     
     
    

