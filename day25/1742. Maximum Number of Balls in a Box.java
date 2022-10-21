class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=Integer.MIN_VALUE;
        for(int i=lowLimit;i<=highLimit;i++){
            int key=0,num=i;
            while(num>0){
                key+=num%10;
                num/=10;
            }
            map.put(key,map.getOrDefault(key,0)+1);
            if(map.get(key)>max)max=map.get(key);
        }
        return max;
    }
}