import java.util.Scanner;
public class RevmoveDuplicateElemnetInArray {
	public static void main(String args[]) {
		int array[]=new int [10];
		System.out.println("Enter the no of elemet:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print("Element in First array are:");
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		int n1=sc.nextInt();
		System.out.println("Enter the second matrix element:");
		for(int j=0;j<n1;j++) {
			array[j]=sc.nextInt();
		}
	}

}
