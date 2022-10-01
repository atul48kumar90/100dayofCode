class Solution {
    public String reverseWords(String s) {
         String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        
        for(String word : words)
        {
            StringBuilder b = new StringBuilder(word);
            b = b.reverse();
            sb.append(b);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}