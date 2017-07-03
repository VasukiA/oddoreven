
import java.util.Scanner;

public class HalfArray {

	public static void main(String[] args) {
		
		System.out.println("Enter the size of an array :");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int array[]=new int[size];
		for (int i=0;i<size;i++) {
			array[i]=sc.nextInt();
		}
		for(int i=0;i<size/2;i++) {
			for (int j=0; j<size/2; j++) {
				if(array[i]<array[j]) {
					int t=array[i];
					array[i]=array[j];
					array[j]=t;
				}
			}
		}
		for(int i=size/2;i<size;i++) {
			for (int j=size/2; j<size; j++) {
				if(array[i]>array[j]) {
					int t=array[i];
					array[i]=array[j];
					array[j]=t;
				}
			}
		}
		for(int i=0;i<size;i++) {
			System.out.print(array[i]+(i<size-1?",":""));
		}

	}

}
