//26. Remove Duplicates from Sorted Array LeetCode
class Solution {
    public int removeDuplicates(int[] nums) 
    {
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                    nums[j]=101;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<101)
            {
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}
