class Solution {
    public int firstUniqChar(String s) {
        char[] c = s.toCharArray();
        
        int[] n = new int[26];
        
        for(char ch: c)
        {
            n[ch - 'a']++;
        }
        
        for (int i=0; i< c.length;i++)
        {
            if(n[c[i]-'a']==1)
            {
                return i;
            }
            
        }
        
       
        return -1;
    }
}