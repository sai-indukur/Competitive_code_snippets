#Combination Sum LeetCode
class Solution:
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        ans=[]
        self.findans(candidates,[],ans,target)
        return ans
    def findans(self,candidates,path,ans,target):
        if target<0:
            return
        if target==0:
            ans.append(path)
            return
        for i in range(len(candidates)):
            self.findans(candidates[i:],path+[candidates[i]],ans,target-candidates[i])
        
