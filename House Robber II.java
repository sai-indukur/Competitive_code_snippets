//213.House Robber.java
class Solution {
    public int rob(int[] nums) 
    {
       if(nums.length==1)
           return nums[0];
       if(nums.length==2)
           return Math.max(nums[0],nums[1]);
       int[] dp1=new int[nums.length];
        int[]dp2 =new int[nums.length];
        //case 1
        dp1[0]=0;
        dp1[1]=nums[1];
        for(int i=2;i<nums.length;i++)
        {
            dp1[i]=Math.max(nums[i]+dp1[i-2],dp1[i-1]);
        }
        //case 2
        dp2[0]=nums[0];
        dp2[1]=Math.max(nums[0],nums[1]);
        nums[nums.length-1]=0;
        for(int i=2;i<nums.length;i++)
        {
            dp2[i]=Math.max(nums[i]+dp2[i-2],dp2[i-1]);
        }
        return Math.max(dp1[nums.length-1],dp2[nums.length-1]);
    }
}
