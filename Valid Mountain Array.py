#941. Valid Mountain Array LeetCode
class Solution:
    def validMountainArray(self, arr: List[int]) -> bool:
        if len(arr)<3:
            return False
        i=0
        m=max(arr)
        if arr[0]==m or arr[len(arr)-1]==m:
            return False
        while(arr[i]!=m):
            if arr[i]>=arr[i+1]:
                return False
            i+=1
        while(i!=len(arr)-1):
            if arr[i]<=arr[i+1]:
                return False
            i+=1
        return True
