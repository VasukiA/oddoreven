import java.io.*;
import java.util.*;
public class Hunter45 {

	public static void main(String[] args) {

		System.out.println("Enter the set of String :");
		String str[] = new Scanner(System.in).next().split(",");
		boolean flag=false;
		for (int i = 0; i < str.length; i++) {
			flag=false;
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].equalsIgnoreCase(str[j])) {
					flag=true;
					str[j]="";
				}
			}
			if (!flag&&str[i]!="") {
				System.out.println(str[i]);
			}
		}

	}

}
