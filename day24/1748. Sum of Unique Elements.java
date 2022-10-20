class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
     HashMap<Integer,Integer> map=new HashMap<>();
     for(int i:nums)  {
         if(map.containsKey(i)) map.put(i,map.get(i)+1);
         else
         map.put(i,1);
     } 
     for(int num : map.keySet()){
     if(map.get(num)==1) sum+=num;
     }

     return sum;
    }
}