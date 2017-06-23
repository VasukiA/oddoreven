import java.util.Scanner;
import java.io.*;
public class Hunter115 {

	public static void main(String[] args) {
		System.out.println("Enter two Strings:");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		int num=1;
		String ans="";
		for (int i = 0; i < str1.length(); i++) {
			ans+=str1.charAt(i)+""+str2.charAt(i);
		}
		if(str1.length() > str2.length()) {
			for(int i=str2.length();i<str1.length();i++) {
				ans+=num+""+str1.charAt(i);
				num++;
			}
		} else {
			for(int i=str1.length();i<str2.length();i++) {
				ans+=num+""+str2.charAt(i);
				num++;
			}
		}
		System.out.println(ans);

	}

}
