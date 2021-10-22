//3. Longest substring without repeating characters LeetCode
class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<=s.length();j++) //This code passed 986/987 test cases ,last
            {                                 // one was time limit exceeded
                if(isUnique(s.substring(i,j)))
                {
                    int temp=s.substring(i,j).length();
                    if(temp>max)
                        max=temp;
                }
            }
        }
        return max;
    }
    public boolean isUnique(String a)
    {
        Set<Character> set=new HashSet<>();
        for(int i=0;i<a.length();i++)
        {
            if(!set.contains(a.charAt(i)))
                set.add(a.charAt(i));
            else
                return false;
        }
        return true;
    }
}



