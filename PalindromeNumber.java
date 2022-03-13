import java.util.Scanner;
public class PalindromeNumber {
public static void main(String args[]) {
	int number,r,sum=0,temp;
	System.out.println("Enter the number:");
	Scanner sc=new Scanner(System.in);
	number=sc.nextInt();
	temp=number;
	while(number>0) {
		r=number%10;
		sum=(sum*10)+r;
		number=number/10;
	}
	if(sum==temp) {
		System.out.println(sum+"is a palindrome number.");
	}
	else {
		System.out.println(sum+"is not a palindrome number.");
	}
	
}
}
