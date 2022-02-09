#532. K-diff Pairs in an Array LeetCode
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        ans=0
        if len(nums)==0 or k<0:
            return 0
        d={}
        for i in nums:
            if i in d.keys():
                d[i]+=1
            else:
                d[i]=1
        if k==0:
            for i in d.keys():
                if d[i]>=2:
                    ans+=1
        else:
            for i in d.keys():
                if i+k in d.keys():
                    ans+=1
        return ans
             
        
                    
        
