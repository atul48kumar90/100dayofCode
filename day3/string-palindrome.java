class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        //s.replaceAll(" ","");
        boolean f=false;
        StringBuilder b=new StringBuilder(str);
        b.reverse();
        String res=b.toString();
        if(str.equals(res))
        {
            f=true;
        }
        return f;
        
    }
}