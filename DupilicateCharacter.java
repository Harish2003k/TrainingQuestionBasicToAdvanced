import java.util.Scanner;
public class DupilicateCharacter {
	public static void main(String args[]) {
		String str;
		System.out.println("Enter the String :");
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		int cnt=0;
		char [] inp =str.toCharArray();
		System.out.println("Duplicate Character is:");
		for(int i=0;i<str.length();i++) {
		for(int j=i+1;j<str.length();j++) {
			if(inp[i]==inp[j]) {
				System.out.println(inp[j]);
				cnt++;
				break;
			}
		}
		}
		
	}

}
