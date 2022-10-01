class Solution {
    public String reverseVowels(String s) {
        String res= "";
        Stack<Character> st = new Stack<>();
        
        for(int i=0; i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            {
                st.push(c);
            }
            else if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
            {
                st.push(c);
            }
        }
        
        for(int i=0;i<s.length(); i++)
        {
            char c = s.charAt(i);
            
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            {
                res += st.pop();
            }
            else if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
            {
                res += st.pop();
            }
            else
            {
                res +=c;
            }
        }
        return res;
    }
}