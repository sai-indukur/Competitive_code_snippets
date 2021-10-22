#3.Longest Substring without repeating characters LeetCode
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        maxl=0
        for i in range(len(s)):
            d={}
            d[s[i]]=1
            for j in range(i+1,len(s)):
                if s[j] in d:
                    break
                else:
                    d[s[j]]=1
            maxl=max(maxl,len(d.keys()))
        return maxl
