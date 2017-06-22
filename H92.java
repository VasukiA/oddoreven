import java.io.*;
import java.util.*;
public class H92 {

	public static void main(String[] args) {

    System.out.println("Enter the String :");
		Scanner sc = new Scanner(System.in);
		String str[] = sc.nextLine().split(" ");
		for (int i = 0; i < str.length; i++) {
			if (!str[i].isEmpty()) {
				System.out.print(str[i] + " ");
			}
		}
	}
}
