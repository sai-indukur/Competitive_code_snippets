#Reverse words in a given string GFG 

# User function Template for python3

class Solution:
    
    #Function to reverse words in a given string.
    def reverseWords(self,S):
        # code here 
        ans=[]
        x=""
        S=S.split(".")
        for i in S:
            ans.insert(0,i)
        for i in ans:
            x=x+"."+i
        return x[1:]
            
            

#{ 
#  Driver Code Starts
# Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for i in range(t):
        s = str(input())
        obj = Solution()
        print(obj.reverseWords(s))

# } Driver Code Ends
