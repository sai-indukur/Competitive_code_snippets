//496. Next Greater Element I Leetcode
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
        int[] ans=new int[nums1.length];
        int k=0;
        for(int i=0;i<nums1.length;i++)
        {
            boolean found=false;
            int idx=findindex(nums1[i],nums2);
            for(int j=idx;j<nums2.length;j++)
            {
                if(nums2[j]>nums1[i]){
                    ans[k]=nums2[j];
                    found=true;
                    break;
                }
            }
            if(found==false)
                ans[k]=-1;
            k++;
            
         }
        return ans;
    }
    public int findindex(int a,int[] nums2)
    {
        System.out.println(a+" "+nums2[0]);
        for(int i=0;i<nums2.length;i++)
        {
            if(nums2[i]==a)
                return i;
        }
        return -1;
        
    }
}
