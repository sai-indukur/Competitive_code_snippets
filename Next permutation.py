#Next Permutation.py  GFG,LeetCode
#User function Template for python3

class Solution:
    def nextPermutation(self, N, arr):
        # code here
        index=-1
        for i in range(len(arr)-2,-1,-1):
            if arr[i]<arr[i+1]:
                index=i
                break
        if index!=-1:
            ele=0
            for i in range(len(arr)-1,-1,-1):
                if arr[i]>arr[index]:
                    ele=arr[i]
                    arr[i]=arr[index]
                    arr[index]=ele
                    break
        
        l=index+1
        r=len(arr)-1
        while(l<r):
            temp=arr[l]
            arr[l]=arr[r]
            arr[r]=temp
            l+=1
            r-=1
        return arr
            

#{ 
#  Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        N = int(input())
        arr = input().split()
        for i in range(N):
            arr[i] = int(arr[i])
        
        ob = Solution()
        ans = ob.nextPermutation(N, arr)
        for i in range(N):
            print(ans[i],end=" ")
        print()
# } Driver Code Ends
