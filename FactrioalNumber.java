import java.util.Scanner;
public class FactrioalNumber {
	public static void main(String args[]) {
		 int  n,fact=1,i;
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("Factroial of number is:"+fact);
	}

}
