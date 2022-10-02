class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] f = new int[26];
        
        for(int i=0;i<s.length();i++)
        {
            f[s.charAt(i) - 'a']++;
        }
        
        int n= f[s.charAt(0)-'a'];
        
        for(int i=0;i<f.length;i++)
        {
            if(f[i] != n && f[i] != 0)
            {
                return false;
            }
        }
        return true;
    }
}