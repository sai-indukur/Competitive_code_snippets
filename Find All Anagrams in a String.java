//438.Find All Anagrams in a String LeetCode
class Solution {
    public List<Integer> findAnagrams(String s, String p) 
    {
        List<Integer> ans=new ArrayList<Integer>();
        for(int i=0;i<s.length()-p.length()+1;i++)
        {
            if(isAnagram(s.substring(i,i+p.length()),p))
                ans.add(i);
        }
        return ans;
    }
    public boolean isAnagram(String s,String p)
    {
        int[] s1=new int[26];
        int[] p1=new int[26];
        for(int i=0;i<s.length();i++)
        {
            s1[s.charAt(i)-'a']++;
            p1[p.charAt(i)-'a']++;
        }
        return Arrays.equals(s1,p1);
    }
}
