//33. Search in Rotated Sorted Array LeetCode
class Solution {
    public int search(int[] nums, int target) 
    {
        //int[] dup=new int[nums.length];
        int pivot=0;
         
        
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
                pivot=i+1;
        }
        int ans=search(nums,0,pivot-1,target);
        if(ans==-1)
            ans=search(nums,pivot,nums.length-1,target);
        return ans;
        
      
    }
    public int search(int[] nums,int l,int r,int target)
    {
        while(l<=r)
       {
           int mid=(l+r)/2;
           if(nums[mid]==target)
               return mid;
           else if(nums[mid]<target)
               l=mid+1;
           else
               r=mid-1;
       }
        return -1; 
    }
}
