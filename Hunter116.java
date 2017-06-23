import java.util.Scanner;
import java.io.*;
public class Hunter116 {

	public static void main(String[] args) {
		System.out.println("Enter the Number :");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt(),index=0,sum=0;
		int remind[]=new int[String.valueOf(num).length()];
		while(num>0) {
			remind[index++]=num%10;
			num/=10;
		}
		for(int i=0;i<index-1;i++) {
			sum+=Math.pow(remind[i], remind[i+1]);
		}
		System.out.println(sum+1);
	}

}
