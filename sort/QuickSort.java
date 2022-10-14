public class QuickSort  {  
    /* function that consider last element as pivot,  
place the pivot at its exact position, and place  
smaller elements to left of pivot and greater  
elements to right of pivot.  */ 

    int partition (int a[], int start, int end)  {  
        int pivot = a[end]; // pivot element  
        int i = (start - 1);  
    
        for (int j = start; j <= end - 1; j++){  
            // If current element is smaller than the pivot  
            if (a[j] < pivot){  
                i++; // increment index of smaller element  
                int t = a[i];  
                a[i] = a[j];  
                a[j] = t;  
            }  
        }  
        int t = a[i+1];  
        a[i+1] = a[end];  
        a[end] = t;  
        return (i + 1);  
    }  
    
    /* function to implement quick sort */  
    void quick(int a[], int start, int end) {
        if (start < end){  
            int p = partition(a, start, end);  //p is partitioning index  
            quick(a, start, p - 1);  
            quick(a, p + 1, end);  
        }  
    }  
    
    
    void printArr(int a[]) {
        for (int i = 0; i < a.length; i++)  
            System.out.print(a[i] + " ");  
    }  

    public static void main(String[] args) {  
        int a[] = { 13, 18, 27, 2, 19, 25 };  
        System.out.println("\nBefore sorting array elements are - ");  
        QuickSort s1 = new QuickSort();  
        s1.printArr(a);  
        s1.quick(a, 0, a.length - 1);  
        System.out.println("\nAfter sorting array elements are - ");  
        s1.printArr(a);  
        System.out.println();  
    }  
}  