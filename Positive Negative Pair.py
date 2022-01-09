#Positive Negative Pair in GFG 
#User function Template for python3

class Solution:
    #Function to return list containing all the pairs having both
    #negative and positive values of a number in the array.
    def findPairs(self,arr,n):
        # code here
        d={}
        ans=[]
        for i in arr:
            if i<0: i=i*-1
            if i in d.keys():
                d[i]=d[i]+1
                ans.append(-i)
                ans.append(i)
            else:
                d[i]=1
        return ans

#{ 
#  Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t=int(input())
    for _ in range(t):
        n=int(input())
        arr=[int(x) for x in input().strip().split()]
        res=Solution().findPairs(arr,n)
        if len(res) == 0:
            print(0)
        else:    
            for x in res:
                print(x,end=' ')
            print()
# } Driver Code Ends
