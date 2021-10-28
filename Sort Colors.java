//75. Sort Colors LeetCode
class Solution {
    public void sortColors(int[] nums) 
    {
        int[] temp=new int[nums.length];
        int r=0;
        int b=0;
        int w=0;
        for(int i=0;i<nums.length;i++)
        {
          if(nums[i]==0)
              r++;
          else if(nums[i]==1)
              w++;
          else
              b++;
        }
        w=r+w;
        b=b+r+w;
        for(int i=0;i<nums.length;i++)
        {
            if(i<r)
                temp[i]=0;
            else if(i>=r && i<w)
                temp[i]=1;
            else
                temp[i]=2;
        }
        for(int i=0;i<nums.length;i++)
            nums[i]=temp[i];
    }
}
