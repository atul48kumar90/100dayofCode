class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        
 Stack<String> st1 = new Stack<>();
        Stack<String> st2 = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
           if (s.charAt(i) == '#') {
                if (st1.size() > 0) st1.pop();
                else continue;
            } else {
                st1.push(String.valueOf(s.charAt(i)));
            }
        }
        
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '#') {
                if (st2.size() > 0) st2.pop();
                else continue;
            } else {
                st2.push(String.valueOf(t.charAt(i)));
            }
        }
        
        s = "";
        t = "";
        for (String st : st1) {
            s += st;
        }
        for (String st : st2) {
            t += st;
        }
        
        return s.equals(t);
    }
}