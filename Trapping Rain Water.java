//42.Trapping Rain Water LeetCode
class Solution {
    public int trap(int[] height) 
    {
        int l_max=0;
        int r_max=0;
        int i=0;
        int j=height.length-1;
        int ans=0;
        while(i<j)             // Two pointer approach is the best!!!
       {
          if(height[i]>l_max) 
              l_max=height[i];
          if(height[j]>r_max)
              r_max=height[j];
          if(l_max<r_max)
              ans+=Math.max(0,l_max-height[i++]);
          else
              ans+=Math.max(0,r_max-height[j--]);
          
       }
        return ans;
    }
}
