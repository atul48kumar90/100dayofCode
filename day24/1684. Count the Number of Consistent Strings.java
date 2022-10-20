class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        int count = 0;
        for(char c : allowed.toCharArray())
        {
            set.add(c);
        }
        
        for(String s : words)
        {
            int res = 1;
            for(char c : s.toCharArray())
            {
                if(!set.contains(c))
                {
                    res = 0;
                }
            }
            if(res ==1)
                count ++;
        }
        return count;
    }
    
}