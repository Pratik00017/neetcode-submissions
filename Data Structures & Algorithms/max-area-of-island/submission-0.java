class Solution {
    public int maxAreaOfIsland(int[][] grid) {
    int count=0;
        
        
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == 1){
                    
                    int area= dfs(grid, i, j);
                    count = Math.max(area, count);
                }
               
            }
        }
        return count;
        
    }
    public int dfs(int[][] grid, int i, int j){
        int count=0;
        if(i <0 || j<0 || i >= grid.length || j >= grid[0].length ||grid[i][j] ==0 ){
            return 0;
        }
        
        grid[i][j]= 0;
        int area = 1;
        
        
        
        area +=dfs(grid, i-1, j);
        area +=dfs(grid, i+1, j);
        area +=dfs(grid, i, j-1);
        area +=dfs(grid, i, j+1);
        return area;
        
    }
}
