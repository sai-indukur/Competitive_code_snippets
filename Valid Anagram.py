#242. Valid Anagram LeetCode
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        lst1=[element for element in s]
        lst2=[element for element in t]
        lst1.sort()
        lst2.sort()
        if(lst1!=lst2):
            return False
        return True
