import java.io.*;
import java.util.Scanner;

public class player24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of the array:");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int array[]=new int[size];
		System.out.println("Enter th array Elements : ");
		for(int i=0;i<size;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("Enter the target value :");
		int target=sc.nextInt();
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(array[i]+array[j]==target) {
					System.out.println(array[i]+","+array[j]);
				}
			}
		}

	}

}
