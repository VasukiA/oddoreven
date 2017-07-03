import java.util.Scanner;

public class Player136 {

	public static void main(String[] args) {

		System.out.println("Enter the size of array :");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean present=false;
		if (N > 0 && N < 1000) {
			int array[] = new int[N];
			for (int i = 0; i < N; i++) {
				array[i] = sc.nextInt();
			}
			

			System.out.println("Enter X value :");
			int X = sc.nextInt();
			for (int i = 0; i < N; i++) {
				if (array[i] == X) {
					present=true;
				} else {
					continue;
				}
			}
			if(present) {
				System.out.println(X+" is found in the Array");
			} else {
				System.out.println(X+" is not in the Array");
			}
		} else {
			System.out.println("Invalid Input");
		}
		

	}
}
