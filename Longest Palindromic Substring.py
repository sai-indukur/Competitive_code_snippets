#5. Longest Palindromic Substring LeetCode
#Expand around center approach works with O(n^2)


class Solution:
    def longestPalindrome(self, s: str) -> str:
        #Expand around center
        res=""
        maxLen=0
        l,r=0,0
        for i in range(len(s)):
            # for odd length strings
            l,r=i,i
            while l>=0 and r<len(s) and s[l]==s[r]:
                if r-l+1>maxLen:
                    print(l,r)
                    maxLen=r-l+1
                    res=s[l:r+1]
                l-=1
                r+=1
                
            # for even length strings
            l,r=i,i+1
            while l>=0 and r<len(s) and s[l]==s[r]:
                if r-l+1>maxLen:
                    maxLen=r-l+1
                    res=s[l:r+1]
                l-=1
                r+=1
        return res
                
                
        
