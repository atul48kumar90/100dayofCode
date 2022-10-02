class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        Map<Integer, Integer> hmap = new HashMap<>();
        
        int[] arr = nums.clone();
        Arrays.sort(arr);
        
        for(int i=0;i<arr.length;i++)
        {
            hmap.putIfAbsent(arr[i], i);
        }
        
        for(int i=0;i<nums.length;i++)
        {
            arr[i] = hmap.get(nums[i]);
        }
        
        return arr;
    }
}