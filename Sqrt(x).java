//69. Sqrt(x)
class Solution {
    public int mySqrt(int x) 
    {
       long i=1;
       while(i*i<=x)
       {
           i++;
       }
        
     i=i-1;
     int ans=(int)i;
     return ans;
     
    }
}
