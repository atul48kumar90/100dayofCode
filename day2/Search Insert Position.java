class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = nums.length;
        int i=0;
        while(i<l && nums[i]<target)
        {
            if(nums[i]==target)
            {
                return i;
            }
            i++;
        }
        return i;
    }
}