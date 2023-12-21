/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle {
	public static void main(String[] args) {
		int sideA = Integer.parseInt(args[0]);
		int sideB = Integer.parseInt(args[1]);
		int sideC = Integer.parseInt(args[2]);
		boolean result;

		result = ((sideA + sideB) > sideC) && ((sideB + sideC) > sideA) && ((sideC + sideA) > sideB);
		
		
		System.out.println(sideA + ", " + sideB + ", " + sideC + ": " + result);
		
				
	}
}
