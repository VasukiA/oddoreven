import java.util.Scanner;
import java.io.*;
public class Hunter102 {

	public static void main(String[] args) {
		System.out.println("Enter the Number :");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int x=num, sum=0;
		while(x>0) {
			num=x;
			while(num>0) {
				sum+=num%10;
				num/=10;
			}
			x/=10;
		}
		System.out.println(sum);

	}

}
