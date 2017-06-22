import java.io.*;
import java.util.*;

public class H58 {

	public static void main(String[] args) {

		System.out.println("Enter the size of Array:");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int count = 0;
		int array[] = new int[size];
		System.out.println("Enter the array Elements:");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Enter target difference :");
		int n = sc.nextInt();
    
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if ((Math.abs(array[i] - array[j])) == n) {
					count++;
					// System.out.println(array[i]+","+array[j]);
				}
			}
		}
		System.out.println(count);

	}

}
