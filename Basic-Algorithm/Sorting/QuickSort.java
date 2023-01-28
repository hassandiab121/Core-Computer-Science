package algorithm;


public class QuickSort {
    private static int j;
    private static Comparable[] items;

    public static void sort(Comparable[] item)
    {
        items = item;
        quickSort(0,item.length-1);

    }

    private static void quickSort(int low, int high)
    {
        if(low < high) {
            j = partition(low, high);
            quickSort(low, j-1 );
            quickSort(j + 1, high);
        }
    }
    private static int partition (int low, int high){
        int pivotIndex = low + high / 2;
        while (low < high) {
            while (items[pivotIndex].compareTo(items[low]) > 0)
                low++;

            while (items[pivotIndex].compareTo(items[high]) < 0)
                high--;

            if (low < high)
             swap(low, high ,items);
        }
       return high;
    }


    private static void swap(int i ,int  j, Comparable[] list)
    {
        Comparable temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

}
