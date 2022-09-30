class Solution {
    public void reverseString(char[] s) {
        
        int si =0;
        int ei = s.length - 1;
        char temp;
        
        while(si<ei)
        {
            temp = s[si];
            s[si] = s[ei];
            s[ei] = temp;
            si++;
            ei--;
        }
        
    }
}