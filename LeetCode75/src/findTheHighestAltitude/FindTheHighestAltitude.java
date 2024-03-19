package findTheHighestAltitude;

public class FindTheHighestAltitude {

	public static void main(String[] args) {
		FindTheHighestAltitude p = new FindTheHighestAltitude();
		int gain[] = {-5,1,5,0,-7};
		System.out.println(p.largestAltitude(gain));

	}
	
	public int largestAltitude(int[] gain) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        
        for(int i =0;i<gain.length;i++){
            sum+=gain[i];
            max = Math.max(max,sum);
        }
        if(max<0)
            return 0;
        else
            return max;
    }

}
