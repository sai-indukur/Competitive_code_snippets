//258. Add Digits LeetCode
class Solution {
    public int addDigits(int num) 
    {
        int sum=0;
        int temp=num;
        while(true)
        {
           sum+=num%10;
            num/=10;
            //temp=num;
            if(num==0){
                num=sum;
                if(sum/10==0)
                    break;
                sum=0;
            }
        }
        return sum; 
    }
}
