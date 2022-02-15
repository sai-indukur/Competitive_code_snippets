#Anagram of String GFG
# function to calculate minimum numbers of characters
# to be removed to make two strings anagram
def remAnagram(str1,str2):
    ans=0
    lst1=[0]*26
    lst2=[0]*26
    for i in str1:
        lst1[ord('a')-ord(i)]+=1
    for i in str2:
        lst2[ord('a')-ord(i)]+=1
    for i in range(26):
        ans+=abs(lst1[i]-lst2[i])
    return ans
    
    #add code here
    
    

#{ 
#  Driver Code Starts
if __name__=='__main__':
    t=int(input())
    for i in range(t):
        str1=input()
        str2=input()
        print(remAnagram(str1,str2))
# } Driver Code Ends
