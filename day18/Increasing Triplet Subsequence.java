class Solution {
    public boolean increasingTriplet(int[] nums) throws NullPointerException {
       int n=nums.length;
        TreeSet<Integer> ts= new TreeSet<>();
        for(int i=0;i<n;i++)
        {
             if(ts.ceiling(nums[i])!=null)
                  ts.remove(ts.ceiling(nums[i]));
            ts.add(nums[i]);
                
        }
        if(ts.size()>=3)
        {
            return true;
        }
        else{
            return false;
        }
    }
}