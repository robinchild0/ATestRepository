import java.util.Scanner;

public class AverageNum 
{
	
	public static void main(String[] args)
	{
		 Scanner scan = new Scanner(System.in);
		System.out.println("Please type 2 numbers on two new lines");
		int num1 = Integer.parseInt(scan.nextLine());
		int num2 = Integer.parseInt(scan.nextLine());
		System.out.println(num1/num2);//This is how you do an average right? Right?
	}

}
