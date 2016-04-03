package quicksort;


import java.util.concurrent.ThreadLocalRandom;

/*
 * A simple implementation of the randomized QuickSort in Java.  The use of a
 * random number for the pivot element make QuickSort to behave as if whatever
 * input it receives is actually an average case. So the expected running time
 * is O(nlogn).
 */
public class QuickSort {
    
    
    private int[] arr;
    private int hi;
    private int lo;

    public void sort(int[] arr) {
        this.arr = arr;
        this.hi = arr.length-1;
        this.lo = 0;
        
        quicksort(arr, lo, hi);
    }
    
    // recursion until the array is sorted
    public void quicksort(int arr[], int lo, int hi){
        
    
        if (lo < hi){
            //the final position of the pivot element
            int p = partition (arr, lo, hi);
            //quicksort the subarray with smaller from pivot elements
            quicksort(arr, lo,  p-1);
            //quicksort the subarray with the bigger elements
            quicksort(arr, p+1, hi);
        }  
     
    }
    
    
    public int partition (int arr[], int lo, int hi){

        int low = arr[0];
        // use of a pseudo random number generator 
        // to pick up a pivot
        int n = ThreadLocalRandom.current().nextInt(lo, hi + 1);
        int pivot = arr[n];
        
        //exchange the pivot with the last element
        arr[n] = arr[hi];
        arr[hi] = pivot;
            
        //here starts the partitioning
        int j = lo;
        
        for (int i = lo; i < hi; i++){
            if (arr[i] <= pivot){
               //if the element at position i is less or equal to pivot
               //exchange it with the element at position j and increase j
               swap(arr, j, i);
               j++;
            }
            
        }
        swap(arr, j, hi);
        
        //return the final position of the pivot
        return j;
    }
    
    public int [] swap (int []arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        
        return arr;
    }
    
    public static void main(String[] args) {
        
        //test
        int [] arr = {4,-12,5,14,1,3};
        
        QuickSort testSort = new QuickSort();
       
        testSort.sort(arr);
        
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
    }
    
}