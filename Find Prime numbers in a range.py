#Find Prime numbers in a range GFG
#User function Template for python3

class Solution:        
    def primeRange(self,M,N):
        #code here
        #isPrime=True
        lst=[]
        for i in range(M,N+1,1):
            #print(i)
            isPrime=True
            if i==1 or i==0:
                continue
            for j in range(2,int(math.sqrt(i)+1)):
                #print(i,j)
                if i%j==0:
                    isPrime=False
                    break
            if isPrime:
                lst.append(i)
        return lst

#{ 
#  Driver Code Starts
#Initial Template for Python 3

import math

if __name__=='__main__':
    t=int(input())
    for _ in range(t):
        M,N=map(int,input().strip().split(" "))
        ob=Solution()
        ans=ob.primeRange(M,N)
        for i in ans:
            print(i,end=" ")
        print()    
# } Driver Code Ends
