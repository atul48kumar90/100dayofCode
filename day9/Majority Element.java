class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length/2;
        int res = 0;
        HashMap<Integer, Integer> hmap = new HashMap<>();
        
        for(int i= 0;i<nums.length;i++)
        {
           hmap.put(nums[i], hmap.getOrDefault(nums[i],0)+1);
            if(hmap.get(nums[i])> n)
            {
                res = nums[i];
            }
        }
        return res;
    }
}