//48. Rotate Image LeetCode
class Solution {
    public void rotate(int[][] matrix) 
    {
        int l=matrix.length;
        int[][] dup=new int[l][l];
        for(int i=0;i<l;i++){
            for(int j=0;j<l;j++)
            {
                dup[i][j]=matrix[i][j];
            }
        }
        
        for(int i=0;i<l;i++){
            int k=l-1;
            for(int j=0;j<l;j++)
            {
                 matrix[i][j]=dup[k][i];
                 k--;
            }
        }
    }
}
