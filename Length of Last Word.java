//58. Length of Last Word 
class Solution {
    public int lengthOfLastWord(String s) 
    {
        s=s.strip();
        int length=0;
        for(int i=s.length()-1;i>=0;i--)//Since we want last word,start from end
        {
          if(s.charAt(i)!=' ')
              length++;
          else
              break;
        }
        return length;
    }
}
