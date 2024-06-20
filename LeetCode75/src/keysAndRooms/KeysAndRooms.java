package keysAndRooms;

import java.util.*;

public class KeysAndRooms {

	Queue<Integer> queue = new LinkedList<>();
	
	public static void main(String[] args) {
		List<List<Integer>> rooms = new ArrayList<>();

        rooms.add(Arrays.asList(1, 3));
        rooms.add(Arrays.asList(3, 0, 1));
        rooms.add(Arrays.asList(2));
        rooms.add(Arrays.asList(0));
        
        KeysAndRooms p = new KeysAndRooms();
        System.out.println(p.canVisitAllRooms(rooms));
        

	}
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int visited[] = new int[rooms.size()];
        visited[0] = 1;
        traverse(0,rooms,visited);
        for(int i=0;i<visited.length;i++){
            if(visited[i]==0)
                return false;
        }
        return true;
    }

    public int[] traverse(int index,List<List<Integer>> rooms , int visited[]){
        List<Integer> keys = rooms.get(index);
        for(int key : keys){
            queue.add(key);
        }
        while(!queue.isEmpty()){
            int a = queue.poll();
            if(visited[a]==0){
                visited[a]=1;
                traverse(a,rooms,visited);
            }
        }
        return visited;
    }

}
