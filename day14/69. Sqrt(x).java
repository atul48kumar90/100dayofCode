class Solution {
    public int mySqrt(int x) {
        int start = 1;
        int end = x;
        int res = 0;
        
        // if( x ==1 || x ==0)
        // {
        //     return x;
        // }
        while(start<=end)
        {
            int mid = start + (end-start) /2;
            
            if(mid<= x/mid)
            {
                start += 1;
                res = mid;
            }
            else{
                end = mid -1;
            }
        }
        return res;
    }
}