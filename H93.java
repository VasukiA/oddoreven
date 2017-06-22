import java.util.Scanner;
import java.io.*;
public class H93 {

	public static void main(String[] args) {
		System.out.println("Enter the String:");
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str[]=str1.split(" ");
		String out="";
		for(int i=0;i<str.length;i++) {
			StringBuffer sb=new StringBuffer();
			out+=sb.append(str[i]).reverse().append(" ");
		}
		String res="";
		for(int i=0;i<str1.length();i++) {
			if(Character.isUpperCase(str1.charAt(i))) {
				res+=Character.toUpperCase(out.charAt(i));
			}
			else {
				res+= Character.toLowerCase(out.charAt(i));
			}
		}
		System.out.println(res);

	}

}
