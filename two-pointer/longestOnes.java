class Solution {
    public int longestOnes(int[] nums, int k) {
        int max = 0;
        for (int left = 0, right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                if (k == 0) {
                    while (nums[left] == 1) {
                        left++;
                    }
                    left++;
                } else {
                    k--;
                }
            }
            max = Math.max(right - left + 1, max);
        }
        return max;
    }
}