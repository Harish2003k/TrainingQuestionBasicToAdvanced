import java.util.*;
public class UserInput {
public static void main(String args[]) {
	int n,n1,sum;
	System.out.println("Enter the number :");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	System.out.println("Enter the number 2:");
   n1=sc.nextInt();
   sum=n+n1;
   System.out.println("sum of number is :"+sum);
   int mult=n*n1;
  System.out.println("Multiplication of number :"+mult);
  float div=n/n1;
  System.out.println("Division of number is :"+div);
 float mod=n%n1;
 System.out.println("modulus of number is:"+mod);
}
}
