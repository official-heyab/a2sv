public class SelectionSort  {  

    void selectSort(int arr[]){
        for (int i = 0; i < arr.length-1; i++){
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < arr.length; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i]; 
            arr[i] = temp;
        }
    }
   
    void printArr(int a[]) {
        for (int i = 0; i < a.length; i++)  
            System.out.print(a[i] + " ");  
    }  

    public static void main(String[] args) {  
        int a[] = { 13, 18, 27, 2, 19, 25 };   
        System.out.println("\nBefore sorting array elements are - ");  
        SelectionSort s1 = new SelectionSort();  
        s1.printArr(a);  
        s1.selectSort(a);  
        System.out.println("\nAfter sorting array elements are - ");  
        s1.printArr(a);
        System.out.println();  
    }  
}

	