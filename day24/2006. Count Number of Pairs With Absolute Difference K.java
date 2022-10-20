class Solution {
    public int countKDifference(int[] nums, int k) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        
        for(int n : nums)
        {
            if(hmap.containsKey(n))
            {
                hmap.put(n, hmap.get(n)+1);
            }
            else
            {
                hmap.put(n,1);
            }
        }
        
        int count = 0;
        for(int i=0; i<nums.length;i++)
        {
            if(hmap.containsKey(nums[i] - k))
            {
                count += (hmap.get(nums[i]-k));
            }
        }
        return count;
    }
}