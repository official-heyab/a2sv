class Solution {
    public boolean isPowerOfFour(int n) {
        double sum;
        for(int i=0;;i++){
            sum = Math.pow(4,i);
            if(sum==n) return true;
            else if (sum>n) break;
        }
        return false;
    }
}