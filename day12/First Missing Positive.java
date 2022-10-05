class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int res =1;
        
        for(int num : nums)
        {
            set.add(num);
            if(num == res)
            {
                while(set.contains(res+1))
                {
                    res++;
                }
                res++;
            }
        }
        return res;
    }
}