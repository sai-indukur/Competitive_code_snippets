//9. Palindrome Number LeetCode
class Solution {
    public boolean isPalindrome(int x) 
    {
        int temp=x;
        if(x<0)
        return false;
        
        int rev=0;
        while(x!=0){
            rev=rev*10+x%10;
            x=x/10;
        }
        
        if(rev==temp)
        return true;
        
        else{
            return false;
        }
    }
}
