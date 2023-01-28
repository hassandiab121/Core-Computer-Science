package algorithm;

public class MergeSort  {
   static void sort(Comparable[] array){
        if (array.length > 1)
        {

            // iterate until reach to first element of the first half of the array
            Comparable[] firsrDividedArray = new Comparable[array.length / 2];
            // helper function arraycopy()
            System.arraycopy(array , 0 , firsrDividedArray, 0 , firsrDividedArray.length);
            sort(firsrDividedArray);




            // iterate until reach to second element of the first half of the array
            Comparable[] secondDividedArray = new Comparable[array.length - array.length / 2];
            System.arraycopy(array , array.length/2 , secondDividedArray, 0 , secondDividedArray.length);
            sort(secondDividedArray);



            merge(firsrDividedArray, secondDividedArray ,array);
        }
   }

    private static void merge(Comparable[] firstArray, Comparable[] secondArray, Comparable[] original)
    {
        int current1 = 0;
        int current2 = 0;
        int current3 = 0;

        // compare elements of the second and the first array to each other
        while (current1 < firstArray.length && current2 < secondArray.length) {
            if (firstArray[current1].compareTo(secondArray[current2]) < 0)
                 original[current3++] = firstArray[current1++];
            else
                original[current3++] = secondArray[current2++];
        }
        // if the element all of array2 sorted in its place  && index of original( array to sort in ) is in of bounds
        while (current1 < firstArray.length)
           original[current3++] = firstArray[current1++];

        // if the element all of array1 sorted in its place  && index of original( array to sort in ) is in of bounds
         while (current2 < secondArray.length)
           original[current3++] = secondArray[current2++];
    }


}


