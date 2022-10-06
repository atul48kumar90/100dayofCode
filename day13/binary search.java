class Solution {
    public int search(int[] nums, int target) {
        return solve(nums,target,0,nums.length-1);
    }
    
    int solve(int[] nums,int target, int lo, int hi){
        
        if(lo > hi){
            return -1;
        }
        int mid=(lo+hi)/2;
        if(nums[mid]==target){
            return mid;
        }
        else if( nums[mid] < target){
            return solve(nums,target,mid+1,hi);
                
        }
        else{
            return solve(nums,target,lo,mid-1);
        }
        
    }
    
}
   