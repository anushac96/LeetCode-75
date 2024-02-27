package containerWithMostWater;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		ContainerWithMostWater p = new ContainerWithMostWater();
		int height[] = {1,8,6,2,5,4,8,3,7};
		System.out.println(p.method(height));
	}
	
	public int method(int[] height) {
        int max = 0;
        int i = 0;
        int j = height.length - 1;
        while (i < j) {
            max = Math.max(max, Math.min(height[i], height[j]) * (j - i));
            if (height[i] < height[j]) {
                ++i;
            } else {
                --j;
            }
        }
        return max;
    }

}
