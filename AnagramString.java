import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
public class AnagramString {
	private static int[] CharArray1;
	private static int[] CharArray2;
	public static void main(String args[]) {
	String str1,str2;
	System.out.println("Enter the First string :");
	Scanner sc=new Scanner(System.in);
	str1=sc.nextLine();
	System.out.println("Enter the Second string:");
	str2=sc.nextLine();
	if(str1.length()==str2.length()) {
	char Array1[]=str1.toCharArray();
	char Array2[]=str2.toCharArray();
	Arrays.sort(CharArray1);
	Arrays.sort(CharArray1);
	boolean result=Arrays.equals(CharArray1,CharArray2);
	if(result) {
		System.out.println(str1+"and"+str2+"are anagram ");
	}
	else {
		System.out.println(str1+"and"+str2+"are not anagram");
	}
	}
	else{
		System.out.println(str1+"and"+str2+"are not anagram ");
	}
	}
}

