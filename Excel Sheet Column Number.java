//171. Excel Sheet Column Number LeetCode
class Solution {
    public int titleToNumber(String columnTitle)
    {
        
        int sum=0;
        char[]c=columnTitle.toCharArray();
        for(int i=c.length-1;i>=0;i--)
        {
            sum+=(c[i]-'A'+1)*Math.pow(26,c.length-1-i);
            System.out.println(sum);
        }
        return sum;
    }
}
