/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		int range = b-a; 
		int randomInt1 = (int)(Math.random()*range) + a;
		int randomInt2 = (int)(Math.random()*range) + a;
		int randomInt3 = (int)(Math.random()*range) + a;

		int min1 = Math.min(randomInt1, randomInt2);
		int min2 = Math.min(randomInt3, min1);
		
		System.out.println(randomInt1);
		System.out.println(randomInt2);
		System.out.println(randomInt3);
		System.out.println("The minimal generated number was " + min2);
	}
}
