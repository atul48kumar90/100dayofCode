class Solution {
    public int lengthOfLastWord(String s) {
        
        String[] s1 = s.split(" ");
        int n=s1.length;
        String res = s1[n-1];
        return res.length();
    }
}