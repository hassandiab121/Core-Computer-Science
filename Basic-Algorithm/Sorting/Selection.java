/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;

/**
 *
 * @author Hassan Diab
 */
public class Selection {
    
   public static void sort(Comparable[] a)
 {
  for(int i = 0; i < a.length; i++ )
  {
 int min = i;
   for(int counter = i+1; counter < a.length; counter++ )
   {
     if (less(a[counter],a[min]))
         min = counter;
     
     
   }
   swap(a,i,min);
  }
 }
   
   public static boolean  less(Comparable v ,Comparable x)
   {
     if (v.compareTo(x) < 0 )
         return true;
     else
         return false;
   }
   
   public static void swap(Comparable[] x, int start ,int end)
   {
   Comparable sw = x[start];
   x[start] = x[end];
   x[end] = sw;
   }
    
    
}
