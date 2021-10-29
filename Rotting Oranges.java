//994. Rotting Oranges LeetCode
class Solution {
    public int orangesRotting(int[][] grid) 
    {
        int fresh=0;
        Queue<int[]> q=new LinkedList();
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]==2)
                    q.add(new int[]{i,j});
                if(grid[i][j]==1)
                    fresh++;
            }
        }
            int[][] directions={{0,1},{1,0},{0,-1},{-1,0}};
            int time=0;
            while(!q.isEmpty() && fresh>0)
            {
                time++;
               int size=q.size();
                while(size-->0)
                {
                    int[] xy=q.poll();
                    for(int[] d:directions)
                    {
                        int x=xy[0]+d[0];
                        int y=xy[1]+d[1];
                    if(x<0 || x>=grid.length || y<0 || y>=grid[0].length || grid[x][y]==0 || grid[x][y]==2)
                        continue;
                    q.add(new int[]{x,y});
                        grid[x][y]=2;
                        fresh--;
                    }
                }
                
            }
            return fresh==0?time:-1;
    }
}
