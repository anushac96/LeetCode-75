package dota2Senate;

import java.util.LinkedList;
import java.util.Queue;

public class Dota2Senate {

	public static void main(String[] args) {
		Dota2Senate p = new Dota2Senate();
		String senate = "DRRDRDRDRDDRDRDR";
		System.out.println(p.predictPartyVictory(senate));

	}
	
	public String predictPartyVictory(String senate) {
		Queue<Integer> queueR = new LinkedList<>();
        Queue<Integer> queueD = new LinkedList<>();
        StringBuffer sb = new StringBuffer(senate);

        for(int i =0;i<senate.length();i++){
            if(senate.charAt(i)=='R'){
                queueR.add(i);
            }else{
                queueD.add(i);
            }
        }

        for(int i =0;
        !queueR.isEmpty() && !queueD.isEmpty();
        i=(i+1)%sb.length()){
            if(sb.charAt(i)=='R'){
                int num = queueD.poll();
                sb.replace(num,num+1,"O");
                queueR.add(queueR.poll());
            }else if(sb.charAt(i)=='D'){
                int num = queueR.poll();
                sb.replace(num,num+1,"O");
                queueD.add(queueD.poll());
            }
        }
        if(queueR.size()>queueD.size()){
            return "Radiant";
        }else{
            return "Dire";
        }
    }

}
