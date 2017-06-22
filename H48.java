import java.util.Scanner;

public class H48 {

	public static void main(String[] args) {
		
		System.out.println("Enter the String:");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println("Enter the substring:");
		String sub=sc.next();
		
		if(str.contains(sub)) {
			System.out.println(str.indexOf(sub.charAt(0)));
		}
		else {
			System.out.println(-1);
		}
		
	}
}
