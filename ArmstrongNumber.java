import java.util.Scanner;
import java.util.*;
public class ArmstrongNumber {
	public static void main(String args[]) {
		int n,temp,r;
		double sum=0;
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		temp=n;
		while(n!=0) {
			r=temp%10;
			sum=sum+Math.pow(r,3);
			temp=temp/10;
		}
		if(temp==n){
			System.out.println(n+"is a armstrong number");
		}
		else {
			System.out.println(n+"is not a armstrong number");
		}
	}

}
