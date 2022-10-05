class Solution {
    public char repeatedCharacter(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        char c = 'c';
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                return (s.charAt(i));
            }
            else
            {
                map.put(s.charAt(i), i);
            }
        }
        return c ;
    }
}