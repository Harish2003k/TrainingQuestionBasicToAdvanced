import java.util.*;
public class StringAnagram {
public static void main(String args[]) {
	String str1,str2;
	System.out.println("Enter the String first:");
	Scanner sc=new Scanner(System.in);
	str1=sc.nextLine();
	System.out.println("Enter the String two:");
	str2=sc.nextLine();
	if(str1.length()==str2.length()) {
		char [] charArray1=str1.toCharArray();
		char [] charArray2=str2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		boolean result=Arrays.equals(charArray1,charArray2);
		if(result) {
			System.out.println(str1+" and "+str2+" are anagram.");
		}
		else {
			System.out.println(str1+" and "+str2+" is not anagram");
		}		
	}
	else {
		System.out.println(str1+" and "+str2+" is not anagram.");
	}
}
}
