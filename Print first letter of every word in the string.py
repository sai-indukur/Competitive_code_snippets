#Print first letter of every word in the string
#User function Template for python3
class Solution:
	def firstAlphabet(self, S):
		# code here
		l=[]
		l=S.split()
		ans=""
		for i in l:
		    ans=ans+i[0]
		return ans

#{ 
#  Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
	T=int(input())
	for i in range(T):
		S = input()
		ob = Solution()
		answer = ob.firstAlphabet(S)
		
		print(answer)


# } Driver Code Ends
