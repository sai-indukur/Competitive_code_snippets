#Gadgets of Doraland GFG 
#User function Template for python3

class Solution:
    def TopK(self, array, k):
        # code here
        d={}
        ans=[]
        for i in array:
            if i in d.keys():
                d[i]+=1
            else:
                d[i]=1
        dans=sorted(d,key=lambda x:(d[x],x),reverse=True)[:k]
        return dans
      
#{ 
#  Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        n = int(input())
        array = [int(x) for x in input().strip().split()]
        k = int(input())
        obj = Solution()
        res = obj.TopK(array, k)
        for each in res:
            print(each, end=' ')
        print()

# } Driver Code Ends
