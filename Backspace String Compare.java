//844.Backspace String Compare LeetCode
class Solution {
    public boolean backspaceCompare(String s, String t) 
    {
        String s1=backspace(s);
        String s2=backspace(t);
        return s1.equals(s2);
    }
    public String backspace(String x)
    {
        Stack<Character> s=new Stack<>();
        for(int i=0;i<x.length();i++)
        {
            if(!s.isEmpty() && x.charAt(i)=='#')
                s.pop();
            else if(x.charAt(i)!='#')
                s.push(x.charAt(i));
        }
        String ans=new String();
        while(!s.isEmpty())
            ans+=s.pop();
        return ans;
    }
}
