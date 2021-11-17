//242. Valid Anagram Leetcode
class Solution {
    public boolean isAnagram(String s, String t) 
    {
        if(s.length()!=t.length())
            return false;
        int[] values1=new int[26];
        int[] values2=new int[26];
        char[] a=s.toCharArray();
        char[] b=t.toCharArray();
        for(int i=0;i<a.length;i++)
        {
            values1[a[i]-97]++;
            values2[b[i]-97]++;
        }
        for(int i=0;i<values1.length;i++)
        {
            if(values1[i]!=values2[i])
                return false;
        }
        return true;
    }
}
