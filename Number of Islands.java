//200. Number of Islands LeetCode
class Solution {
    char[][] grid;
    public int numIslands(char[][] grid) 
    {
        int count=0;
        int ans=0;
        this.grid=grid;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1'){
                    ans=dfs(i,j);
                    if(ans!=0)
                        count++;
                }
            }
        }
        return count;
    }
    public int dfs(int i,int j)
    {
        if(i<0 || i==grid.length || j<0 || j==grid[0].length)
            return 0;
        if(grid[i][j]!='1')
            return 0;
        grid[i][j]='2';
        int left=dfs(i,j-1);
        int right=dfs(i,j+1);
        int top=dfs(i-1,j);
        int down=dfs(i+1,j);
        
        return 1+top+down+left+right;
    }
}
