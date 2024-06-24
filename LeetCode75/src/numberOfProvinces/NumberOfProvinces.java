package numberOfProvinces;

public class NumberOfProvinces {

	public static void main(String[] args) {
		NumberOfProvinces p = new NumberOfProvinces();
		int[][] isConnected = {{1,1,0},{1,1,0},{0,0,1}};
		System.out.println(p.findCircleNum(isConnected));

	}
	
	public int findCircleNum(int[][] isConnected) {
        int visited[] = new int[isConnected.length];
        int province = 0;
        for(int i =0;i<isConnected.length;i++){
            if(visited[i]==0){
                traverse(i,isConnected, visited);
                province++;
            }
        } 
        return province;
    }

    public void traverse(int i,int[][] isConnected, int[] visited){
        visited[i] = 1;
        for(int j=0;j<isConnected[i].length;j++){
            if(isConnected[i][j]==1 && i!=j && visited[j]==0){
                traverse(j,isConnected, visited);
            }
        }
        return;
    }

}
