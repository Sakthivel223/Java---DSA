class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int o = image[sr][sc];
        if(o != color)
        {
            dfs(image,sr,sc,o,color);
        }
        return image;
    }
    public static void dfs(int a[][],int i,int j,int o,int color)
    {
        if(i >= a.length || i < 0 || j >= a[0].length || j < 0)
            return;
        if(a[i][j] != o) return;

        a[i][j] = color;
        dfs(a,i+1,j,o,color);
        dfs(a,i-1,j,o,color);
        dfs(a,i,j+1,o,color);
        dfs(a,i,j-1,o,color);
    }
}
