class Solution {
    public int arrangeCoins(int n) {
        
        long start = 0, end = n;
        
        while(start<=end)
        {
            long mid = start + (end-start)/2;
            
            long steps = mid *(mid+1) /2;
            
            if(steps == n)
            {
                return (int)mid;
            }
            if(n<steps)
            {
                end = mid -1;
            }
            else
            {
                start = mid +1;
            }
        }
        return (int)end;
    }
}