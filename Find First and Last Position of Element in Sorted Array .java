//34. Find First and Last Position of Element in Sorted Array LeetCode
class Solution {
    public int[] searchRange(int[] nums, int target) 
    {
        int[] ans=new int[2];
        int l=0;
        int r=nums.length-1;
        boolean found=false;
        boolean both_found=false;
        int mid=0;
        while(l<=r)
        {
             mid=l+(r-l)/2;
            if(nums[mid]==target)
            {
                found=true;
                if(nums[mid-1]==target){
                    both_found=true;
                ans[0]=mid-1;
                ans[1]=mid;
                }
                if(nums[mid+1]==target)
                {
                    both_found=true;
                    ans[0]=mid;
                    ans[1]=mid+1;
                }
                break;
            }
            else if(nums[mid]<target)
                l=mid+1;
            else
                r=mid-1;
        }
        if(found==true && both_found==false)
        {
            ans[0]=mid;
            ans[1]=mid;
        }
        if(found==false)
        {
            ans[0]=-1;
            ans[1]=-1;
        }
        return ans;
    }
}
