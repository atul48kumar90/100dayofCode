class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        boolean stop = false;
        
        while(i >= 0 && !stop)
        {
            int d = digits[i];
            if(d==9)
            {
                digits[i]=0;
            }
            else{
                digits[i] = digits[i]+1;
                stop = true;
            }
            i--;
        }
        if(digits[0] == 0)
        {
            int[] out = new int[digits.length+1];
            out[0] = 1;
            for(int j=1; j<out.length;j++)
            {
                out[j] = digits[j-1];
            }
            return out;
        }
        return digits;
    }
}