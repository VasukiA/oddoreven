import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Player213 {

	public static void main(String[] args) {
		
		System.out.println("Enter the String :");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		Set<Character> set = new LinkedHashSet<Character>();
		for(int i=0; i<input.length(); i++) {
			set.add(input.charAt(i));
		}
		
		Iterator<Character> it=set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next());
		}
	}

}
