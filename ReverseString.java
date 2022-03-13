import java.util.Scanner;
public class ReverseString {
	public static void main(String args[]) {
		String str,rev="";
		System.out.println("Enter the String tha you want to reverse:");
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		int length=str.length();
		for(int i=length-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("Reversed string is:"+rev);
	}

}
