
package problemsolving;
import java.util.Scanner;
/**
 *
 * @author Hassan Diab
 */
public class OddSum {
    public static void main(String args[])
    {
        int s=0;
           Scanner sc = new Scanner(System.in);
            int numberOfCases=sc.nextInt();
            int[] array =new int[numberOfCases];
            int[] sum =new int[numberOfCases*numberOfCases];
     for(int i=0 ;i<array.length;)
       {
       array[i]=sc.nextInt();
       i++;
       }
     for (int x=0;x<array.length; x++)
     { 
          
         int i=0;
           for (;i<array.length;i++)
              {
//                  if (z==sum.length-1)
//                      break;
              sum[s]=array[x]+array[i];
              s++;

               }
     }
     int newarraysize=0;
     
     for (int y=0; y<sum.length;y++)
       {
     if(sum[y]==0)
         {
         sum[y]=0;
         newarraysize=(numberOfCases*numberOfCases)-1;
          System.out.println(newarraysize);
         }
          
        }
     int[] sumfinal= new int[newarraysize];
//     int sumcounter=0;
         for (int d=0;d<sum.length;d++)
         {
             if (sum[d]!=0)
             for(int e=0;e<sumfinal.length ;e++)
             {
             sumfinal[e]=sum[d];
             }

         }
             
              
     // code to find max
//             int z = 1;
//            int i = 0;
//            
//           for ( ;i<sumfinal.length || (z)<sumfinal.length;)
//
//             {
//                            
//
//                // to leave from loop if we rach to the end of array 
//             if (z==(sumfinal.length)-1 || i==(sumfinal.length)-1)  
//
//                      break;
//                 
//                     
//
//
//               // to move to second iteration in case of equals  
//             if (sumfinal[i]==sumfinal[z] )
//                   {
//                     i++;                      
//                    continue;
//                    }
//
//
//
//             if (sumfinal[z]>sumfinal[i])
//                   i++;
//               else
//                   z++;
//
//             }
//
//           if (sumfinal[i]<sumfinal[z])
//               System.out.println(sumfinal[z]);
//           else
//               System.out.print(sumfinal[i]);
          }
//  
    }
   

