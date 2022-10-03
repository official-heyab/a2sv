class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        LinkedList <Integer> output = new LinkedList<Integer>();
        Arrays.sort(nums);
        
        //add indexes to linked list
        for(int i=0; i<nums.length; i++ )
            if(nums[i]==target)
                output.add(i);

        return output;
    }
}