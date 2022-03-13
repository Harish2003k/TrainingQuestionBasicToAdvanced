import java.util.Scanner;
class StringPalindrome{
	public static void main(String args[]) {
		String str,rev="";
		System.out.println("Enter the string:");
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		int length=str.length();
		for(int i=length-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println(str+"is a palindome string.");
		}
		else
			System.out.println(str+"is not a palindrome string");
	}
}