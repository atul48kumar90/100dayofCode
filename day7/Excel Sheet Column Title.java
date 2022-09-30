class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder s = new StringBuilder("");
        int n = columnNumber;
        while(n>0)
        {
            n--;
            s.append((char)('A'+n%26));
            n /= 26;
        }
        s.reverse();
        return s.toString();
    }
}
