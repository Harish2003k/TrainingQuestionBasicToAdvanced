import java.util.*;
public class ReverseNumber {
	public static void main(String args[]) {
		int n,remainder,rev = 0;
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n!=0) {
			remainder=n%10;
			rev=rev*10+remainder;
			n=n/10;
		}
		System.out.println("Reverse of a number is"+rev);
	}

}
