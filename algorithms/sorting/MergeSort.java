package mergesort;

/**
 * A simple implementation of mergesort. Average and worst case performance
 * O(nlogn)
 */
public class MergeSort {
    
    private int[] arr; 
    private int p;
    private int r;
    
     
    public void sort(int[] arr) {
        this.arr = arr;
        p = 0;
        r = arr.length-1;
       
        mergesort(arr, p, r);
    }
    
    public void mergesort(int[] arr, int p, int r){  
        //the base case (when the array has one or zero elements
        //return)
        if (p < r){  
            // else divide the array in two subarrays
            int q = (p + r) / 2;  
            //conquer by recursively sorting the two subarrays
            mergesort(arr, p, q);
            mergesort(arr, q+1, r);
            //combine the elements back by merging the two sorted arrays
            //into a sorted sequence
            merge(arr, p, q, r);
        }
      
    }
    
    public void merge(int[] arr, int p, int q, int r){
        
        int[] arr2 = new int [r+1]; //make a helper array
        int i, j, k;
   
        i = k = p;
        j = q + 1;
        
        //while the left and right array not empty
        while (i <= q && j <= r){ 
            if (arr[i] <= arr[j]){ //if the element at left array is smaller
                arr2[k] = arr[i];  //put it at helper array and increament
                i++;               //left arrays pointer
            }
            else{
                arr2[k] = arr[j]; //else do the same with the right array 
                j++;
            }
            k++; 
        }
        
        while (i <= q){       // if left array has leftovers
            arr2[k] = arr[i]; // put them at the end of helper array
            i++;
            k++;    
        }
       
        while (j <= r){      // the same with the right array
            arr2[k] = arr[j];
            j++;
            k++;
        }
        
        for (int m = p; m <= r; m++){   //copy the sorted elements from the
             arr[m] = arr2[m];          //helper array to the initial array
        }
    
    }

   
    public static void main(String[] args) {
        
        //test
        int [] arr = {45,2,-9,3,16,7,0,1};
        
        MergeSort testSort = new MergeSort();
       
        testSort.sort(arr);
        
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
    }
    
}
