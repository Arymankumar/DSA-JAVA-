class Solution {
    public int equalPairs(int[][] grid) {
        Map<List<Integer>,Integer> rowMap=new HashMap<>();
        int length=grid.length;
        int count=0;
        for(int i=0;i<length;i++){
            List<Integer> row =new ArrayList<>();
            for(int j=0;j<length;j++){
                row.add(grid[i][j]);
            }
            rowMap.put(row, rowMap.getOrDefault(row,0)+1);
        }
        for(int j=0;j<length;j++){
            List<Integer> col=new ArrayList<>();
            for(int i=0;i<length;i++){
                col.add(grid[i][j]);
            }
            count=count+rowMap.getOrDefault(col,0);
        }
        return count;
    }
}