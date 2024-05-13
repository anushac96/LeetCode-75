package equalRowAndColumnPairs;

import java.util.HashMap;
import java.util.List;

public class EqualRowAndColumnPairs {

	public static void main(String[] args) {
		EqualRowAndColumnPairs p = new EqualRowAndColumnPairs();
		int grid[][] = {{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}};
		System.out.println(p.equalPairs1(grid));
		System.out.println(p.equalPairs2(grid));

	}
	
	// bruteforce
	public int equalPairs1(int[][] grid) {
        int count = 0;
        for(int i =0;i<grid.length;i++){
            for(int j =0;j<grid[i].length;j++){
                boolean isEqual = true;
                for(int k = 0;k<grid[i].length;k++){
                    if(grid[i][k]!=grid[k][j]){
                        isEqual = false;
                        break;
                    }
                }
                if(isEqual)
                    count++;
            }
        }
        return count;
    }
	
	public int equalPairs2(int[][] grid) {
        HashMap<List<Integer>,Integer> map = new HashMap<List<Integer>,Integer>();
        int count =0;
        for(int row=0;row<grid.length;row++){
            Integer a[] = new Integer[grid[row].length];
            for(int col =0;col<grid.length;col++){
                a[col] = grid[row][col];
            }
            List<Integer> keyList = List.of(a);
            map.put(keyList,map.getOrDefault(keyList,0)+1);
        }

        for(int col=0;col<grid.length;col++){
        	Integer a[] = new Integer[grid[col].length];
            for(int row =0;row<grid.length;row++){
                a[row] = grid[row][col];
            }
            List<Integer> keyList = List.of(a);
            if(map.containsKey(keyList))
                count = count+map.get(keyList);
        }
        return count;
    }
}
