

public class MergeSort  {   
    
    void merge(int arr[], int l, int m, int r){
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        
        int L[] = new int[n1];
        int R[] = new int[n2];

        //copy data
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
 
    // Main function that sorts arr[l..r] 
    public void sort(int arr[], int l, int r){
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    void printArr(int a[]) {
        for (int i = 0; i < a.length; i++)  
            System.out.print(a[i] + " ");  
    }  

    public static void main(String[] args) {  
        int a[] = { 13, 18, 27, 2, 19, 25 };   
        System.out.println("\nBefore sorting array elements are - ");  
        MergeSort s1 = new MergeSort();  
        s1.printArr(a);  
        s1.sort(a, 0, a.length-1);  
        System.out.println("\nAfter sorting array elements are - ");  
        s1.printArr(a);
        System.out.println();  
    }  
}


    