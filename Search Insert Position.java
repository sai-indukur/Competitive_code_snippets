//35. Search Insert Position
class Solution {
    public int searchInsert(int[] nums, int target) 
    {
            boolean found=false;
            int start=0;
            int end=nums.length-1;
            int ans=0;
            while(start<=end)
            {
                int mid=(start+end)/2;
                if(nums[mid]==target){
                    found=true;
                    return mid;
                }
                else if(nums[mid]<target)
                    start=mid+1;
                    
                else
                    end=mid-1;
            }
        return start;
     }
}
