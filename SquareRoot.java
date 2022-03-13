import java.util.Scanner;
public class SquareRoot {
	public static void main(String args[]) {
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		double square=Math.pow(x, 0.5);
		System.out.println("Square root of number is"+square);
	}

}
