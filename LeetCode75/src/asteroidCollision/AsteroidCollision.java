package asteroidCollision;

import java.util.Stack;

public class AsteroidCollision {

	public static void main(String[] args) {
		AsteroidCollision p = new AsteroidCollision();
		int asteroids[] = {-2,-2,1,-2};
		
		System.out.println(p.asteroidCollision(asteroids));
	}
	
	public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int i =0;i<asteroids.length;) {
        	if(stack.isEmpty()){
        		stack.push(asteroids[i]);
                i++;
            }
        	else {
        		if(stack.peek()>=0 && asteroids[i]<0) {
        			int collisionNum = asteroids[i] * (-1);
        			if(stack.peek()<collisionNum) {
        				stack.pop();
        			}else if(stack.peek()==collisionNum) {
        				stack.pop();
        				i++;
        			}
        			else {
        				i++;
        			}
        		}else{
                    stack.push(asteroids[i]);
                    i++;
                }
        	}
        }
        int a[] = new int[stack.size()];
        int i = stack.size()-1;
        while(!stack.isEmpty()) {
        	a[i--] = stack.pop();
        }
        return a;
    }

}
