#27. Remove Element LeetCode
class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        k=0
        count=0
        for i in range(len(nums)):
            if nums[i]==val:
                count+=1
            else:
                nums[k]=nums[i]
                k+=1
        return len(nums)-count
                
        
