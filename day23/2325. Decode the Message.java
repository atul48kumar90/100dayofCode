class Solution {
    public String decodeMessage(String key, String message) {
        key = key.replaceAll(" ","");
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Character> hmap = new HashMap<>();
        
        char c = 'a';
        
        for(int i=0;i<key.length();i++)
        {
            char s = key.charAt(i);
            if(!hmap.containsKey(s))
            {
                hmap.put(s,c++);
            }
        }
        
        for(int i=0;i<message.length();i++)
        {
            if(hmap.containsKey(message.charAt(i)))
            {
                sb.append(hmap.get(message.charAt(i)));
            }
            else
            {
                sb.append(message.charAt(i));
            }
        }
        return sb.toString();
    }
}