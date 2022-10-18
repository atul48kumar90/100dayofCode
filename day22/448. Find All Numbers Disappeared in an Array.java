class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            int val = Math.abs(nums[i]) - 1;
            if(nums[val] > 0)
            {
            nums[val] = -1* nums[val];
            }
        }
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] > 0)
            {
                al.add(i+1);
            }
        }
        return al;
    }
}