import java.util.Scanner;
class PrimeNumber{
	public static void main(String args[]) {
		int num,count=0;
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		for(int i=1;i<=num;i++){
		if(num%i==0) {
			count+=1;
		}
		}
		if(count<=2) {
			System.out.println("Yes ,Prime number..");
		}
		else {
			System.out.println("No , prime number..");
		}
	}
}
