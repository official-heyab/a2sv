class Solution {
    public boolean isPowerOfThree(int n) {
        double sum;
        for(int i=0;;i++){
            sum = Math.pow(3,i);
            if(sum==n) return true;
            else if (sum>n) break;
        }
        return false;

        
    }
}