#1091. Shortest Path in Binary Matrix
class Solution:
    def shortestPathBinaryMatrix(self, grid: List[List[int]]) -> int:
        n=len(grid)
        if grid[n-1][n-1] or grid[0][0]:
            return -1
        q=[(0,0,1)]                                       #done using BFS
        grid[0][0]=1
        for i,j,d in q:
            if(i==n-1 and j==n-1): return d
            for x,y in [(i,j+1),(i+1,j),(i-1,j),(i,j-1),(i+1,j+1),(i-1,j-1),(i-1,j+1),(i+1,j-1)]:
                if 0<=x<n and 0<=y<n and grid[x][y]==0:
                    grid[x][y]=1
                    q.append((x,y,d+1))
        return -1
