#58. Length of Last Word
class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        s.strip();
        x=s.split()
        return len(x[-1])
