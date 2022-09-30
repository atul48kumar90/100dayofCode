class Solution {
    public String capitalizeTitle(String title) {
        
        String [] words = title.split(" ");
        String res = "";
        
        for(String word: words)
        {
            word = word.toLowerCase();
            if(word.length() < 3)
            {
                res += word.toLowerCase();
            }
            else
            {
            res += word.substring(0,1).toUpperCase() + word.substring(1, word.length());
            }
            res += " ";
        }
        return res.trim();
    }
}