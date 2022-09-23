class Solution {
    public int[] runningSum(int[] nums) {
        int l = nums.length;
        int res[] = new int[l];
        
        for(int i=0; i<l; i++)
        {
            if(i>0)
            {
            res[i] = nums[i]+res[i-1];
            }
            else
            {
                res[i] = nums[i];
            }
        }
           return res;
    }
}