import java.util.Scanner;

public class RandomRange {
	
	public static void main(String args) {
		System.out.println("Give lower and upper bound (int)");
		Scanner scan = new Scanner(System.in);
		try {
			int x = scan.nextInt();
			int y = scan.nextInt();
			System.out.println("Random int: " + (Math.random()+y)*x);
		}
		catch(Exception e) {
			System.out.println("Error");
		}
		scan.close();
	}
	
}
