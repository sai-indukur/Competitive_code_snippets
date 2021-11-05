#441. Arranging Coins LeetCode
class Solution:
    def arrangeCoins(self, n: int) -> int:
        l=0
        r=n
        while(l<=r):
            mid=(l+r)//2
            if mid*(mid+1)//2<n:
                l=mid+1
            elif mid*(mid+1)//2>n:
                r=mid-1
            else:
                return mid
        return r
