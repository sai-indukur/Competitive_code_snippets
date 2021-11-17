//383. Ransom Note LeetCode
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) 
    {
        int count=0;
        char[] mag=magazine.toCharArray();
        for(int i=0;i<ransomNote.length();i++)
        {   char c=ransomNote.charAt(i);
            for(int j=0;j<mag.length;j++)
            {
               if(mag[j]==c) 
               {
                 count++;
                 mag[j]=0;
                   break;
               }
            }
        }
        return count==ransomNote.length()?true:false; 
    }
}
