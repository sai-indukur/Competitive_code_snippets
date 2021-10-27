//11. Container With Most Water LeetCode
class Solution {
    public int maxArea(int[] height) 
    {
        int ans=0;
        int i=0;
        int j=height.length-1;
        while(i!=j)
        {
            int l=height[i]<height[j]?height[i]:height[j];
            int area=(j-i)*l;
            if(area>ans)
                ans=area;
            if(height[i]>height[j])
                j--;
            else
                i++;
        }
        return ans;
    }
}
