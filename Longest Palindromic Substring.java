//5. Longest Palindromic Substring LeetCode
// This code is a brute force approach with O(n^3) ,gives TLE when executed in LeetCode ,check the py version of same problem which is efficient
class Solution {
    public String longestPalindrome(String s) 
    {
        int max=0;
        int len=0;
        String ans=" ";
        int j=0;
        boolean contains_palindrome=false;
        for(int i=0;i<s.length();i++)
        {
            for(j=i+1;j<=s.length();j++)
            {
                if(isPalindrome(s.substring(i,j)))
                {
                    contains_palindrome=true;
                    len=(s.substring(i,j)).length();
                    if(len>max)
                  {
                    max=len;
                    ans=s.substring(i,j);
                  }
                    
                }
            }
        }
        //if(!contains_palindrome)
            //return s.substring(0,1);
        return ans;
    }
    public boolean isPalindrome(String t)
    {
        int j=t.length()-1;
        int i=0;
        while(i<j)
        {
          if(t.charAt(i)!=t.charAt(j))
              return false;
            j--;
            i++;
          
        }
        return true;
    }
}
