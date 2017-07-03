import java.util.Scanner;

public class Player131 {

	public static void main(String[] args) {
  
		System.out.println("Enter the number :");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int no=num;
		int count=0, sum=0;
		//int digit[]=new int[String.valueOf(num).length()];
		while (num > 0) {
			count++;
			num/=10;
		}
		while(no>0) {
			if(count%2!=0) {
				sum+=no%10;
			}
			count--;
			no/=10;
		}
		if(sum%2!=0) {
			System.out.println("odd");
		} else {
			System.out.println("even");
		}
		

	}

}
