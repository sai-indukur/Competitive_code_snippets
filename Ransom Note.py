#383 RansomNote LeetCode
class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        d={}
        for i in magazine:
            if i in d.keys():
                d[i]+=1
            else:
                d[i]=1
        for j in ransomNote:
            if j not in d.keys():
                return False
            d[j]-=1
            if d[j]<0:
                return False
        return True
