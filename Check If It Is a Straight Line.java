//1232. Check If It Is a Straight Line LeetCode
class Solution {
    public boolean checkStraightLine(int[][] coordinates) 
    {
    if(coordinates[0][0]-coordinates[1][0]==0)
    {
        for(int i=0;i<coordinates.length-1;i++)
        {
            if(coordinates[i][0]!=coordinates[i+1][0])
                return false;
        }
        return true;
    }
    double slope=(double)(coordinates[0][1]-coordinates[1][1])/(coordinates[0][0]-coordinates[1][0]);
        
        for(int i=0;i<coordinates.length;i++)
        {
           double xi=coordinates[i][0]-coordinates[0][0];
           double yi=coordinates[i][1]-coordinates[0][1];
          //  if(xi-coordinates[0][0]==0)
           //     return false;
            System.out.println(xi+" "+yi+" "+slope);
            if(yi!=slope*xi)
                return false;
        }
        return true;
    }
}
