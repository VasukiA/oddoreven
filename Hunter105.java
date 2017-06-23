import java.util.Scanner;
import java.io.*;
public class Hunter105 {

	public static void main(String[] args) {
		System.out.println("Enter the Number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int remind[]=new int[String.valueOf(num).length()];
		int index=0;
		while(num>0) {
			remind[index++]=num%10;
			num/=10;
		}
		int sum = 1,ans=0,loop=0;
		for(int i=index-1;i>-1;i--) {
			sum=1;
			if(i-1>-1) {
			loop=remind[i-1];
			while(loop>0) {
				sum*=remind[i];
				loop--;
			}
			ans+=sum;
			}
		}
		System.out.println(ans+remind[0]);

	}

}
