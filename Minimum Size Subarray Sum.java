//209 Minimum size subarray sum LeetCode
class Solution {
    public int minSubArrayLen(int target, int[] nums) 
    {
        boolean found=false;
        int min=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            int sum=0;
            int count=0;
            for(int j=i;j<nums.length;j++)
            {
                count++;
                sum+=nums[j];
                if(sum>=target){
                    min=Math.min(min,count);
                    found=true;
                }
            }
        }
        return found==false?0:min;
    }
}
