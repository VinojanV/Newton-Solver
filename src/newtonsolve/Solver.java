/**
 * 
 */
package newtonsolve;

import java.util.Scanner;

/**
 * @author vinoj
 * July 17th 2018
 *
 */
public class Solver {

	public void read() {
		String[] eq;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter equation to approximate roots in the format - coefficient degree operation - eg 2x^2 + 3x would be 2 2 + 3 1");
		String equation = sc.nextLine();
		sc.close();
		
		eq = equation.split(" ");
		
	}
	
	public float solve(float deg2, float deg1) {
		
		float x = 0;
		
		while(true) {
			float check = x;
			x = 0; //TODO put some formula
			
			if (check == x) {
				break;
			}
		}
		
		return x;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
