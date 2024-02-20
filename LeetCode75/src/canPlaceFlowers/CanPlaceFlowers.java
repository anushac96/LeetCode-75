package canPlaceFlowers;

public class CanPlaceFlowers {

	public static void main(String[] args) {
		CanPlaceFlowers p = new CanPlaceFlowers();
		int[] flowerbed = {0};
		int n = 0;
		System.out.println(p.method(flowerbed,n));
	}
	
	public boolean method(int[] flowerbed, int n) {
		if(flowerbed.length==1){
            if((flowerbed[0]==0) || (flowerbed[0]==1 && n==0))
                return true;
            else 
                return false;
        }
        else{
            for(int i =0;i<flowerbed.length;i++){
                if(flowerbed[i]==0){
                    if((i-1==-1 || flowerbed[i-1]==0) && 
                    (i+1==flowerbed.length || flowerbed[i+1]==0)
                    && n>0){
                        n-=1;
                        flowerbed[i] = 1;
                    }  
                }
            }
            if(n==0)
                return true;
            else
                return false;
        }
    }
}
