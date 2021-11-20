//20. Valid Parentheses LeetCode
class Solution {
    public boolean isValid(String s) 
    {
       Stack<Character> stack=new Stack<>();
        HashMap<Character,Character> map=new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
       for(int i=0;i<s.length();i++)
       {
           if(stack.isEmpty())
               stack.push(s.charAt(i));
           else if(map.containsKey(stack.peek()) && map.get(stack.peek())==s.charAt(i))
               stack.pop();
           else
               stack.push(s.charAt(i));
       }
       return stack.isEmpty();
        
    }
}
