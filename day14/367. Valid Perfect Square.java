class Solution {
    public boolean isPerfectSquare(int num) {
        
        int low = 0;
        int high = 46340;
        int mid = 0;
        
        while(low<= high)
        {
            mid = (low+high)/2;
            
            if(mid*mid == num)
            {
                return true;
            }
            if(mid*mid < num)
            {
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return false;
    }
}