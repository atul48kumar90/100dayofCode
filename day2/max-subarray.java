class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        
        int curr = nums[0];
        int max = nums[0];
        
        for(int i=0;i<n;i++)
        {
            curr = Math.max(nums[i], curr+nums[i]);
            max = Math.max(curr, max);
        }
        return max;
    }
}