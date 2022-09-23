class Solution {
    public int pivotIndex(int[] nums) {
        int l =nums.length;
        
        int left= 0;
        int total =0;
        int res;
       
        for(int i=0; i<l;i++)
        {
            total += nums[i];
        }
        
        for(int i=0;i<l;i++)
        {
            if(left == (total -left-nums[i]))
            {
                 return i;
            }
            else {
                left += nums[i];
            }
        }
        return -1;
        
    }
}

//leftsum == (total-leftsum-nums[i]);