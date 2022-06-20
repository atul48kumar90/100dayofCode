class Solution {
    public boolean isValid(String s) {
        char[] x = s.toCharArray();
        Stack stk = new Stack<>();
        
        for(int i=0;i<x.length;i++)
        {
            if(x[i] == '(' || x[i]=='{' || x[i]=='[')
            {
                stk.push(x[i]);
            }
            else if(stk.empty()==false && (x[i]==')' && stk.peek().equals('('))
                   || ( x[i] == ']'  && stk.peek().equals('['))
           || ( x[i] == '}'  && stk.peek().equals('{')))
            {
                stk.pop();
            }
            else
        {
            return false;
        }
    }
    
    if(stk.empty() == true){
        return true;
    }else{
        return false;
    }
        
    }
}