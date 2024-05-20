package numberOfRecentCallS;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfRecentCalls {

	public static void main(String[] args) {
		NumberOfRecentCalls p = new NumberOfRecentCalls();
		RecentCounter r = new RecentCounter();
		int pings[] = {1,100,3001,3002};
		for(int i =0;i<pings.length;i++) {
			System.out.println(r.ping(pings[i]));
		}

	}

}

class RecentCounter {
    Queue<Integer> queue = new LinkedList<>();
    public RecentCounter() {
        
    }
    
    public int ping(int t) {
        if(t<=3000){
            queue.add(t);
        }else{
            int num = t-3000;
            while(!queue.isEmpty() && queue.peek()<num)
                queue.poll();
            queue.add(t);
        }
        return queue.size();
    }
}
