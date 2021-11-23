//70. Climbing Stairs
class Solution {
    public int climbStairs(int n) 
    {
        if(n==1 || n==2)
            return n;
        
         int sum=0;
         int f=1; int s=2;
         for(int i=1;i<n-1;i++)
         {
             sum=f+s;
             f=s;
             s=sum;
         }
        return sum;
    }
}
