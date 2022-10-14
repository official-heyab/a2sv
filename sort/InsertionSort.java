public class InsertionSort  {      
    void sortInsert(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int tmp = 0;
                if (nums[i] > nums[j]) {
                    tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
    }
    void printArr(int a[]) {
        for (int i = 0; i < a.length; i++)  
            System.out.print(a[i] + " ");  
    }  

    public static void main(String[] args) {  
        int a[] = { 13, 18, 27, 2, 19, 25 };   
        System.out.println("\nBefore sorting array elements are - ");  
        InsertionSort s1 = new InsertionSort();  
        s1.printArr(a);  
        s1.sortInsert(a);  
        System.out.println("\nAfter sorting array elements are - ");  
        s1.printArr(a);
        System.out.println();  
    }  
}