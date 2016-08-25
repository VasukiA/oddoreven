import java.io.*;
import java.util.*;
class h40
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int sum=0;
while(x>0)
{
int xx=x%10;
sum+=xx;
x=x/10;
}
String y=String.valueOf(sum);
StringBuffer sb=new StringBuffer(y).reverse();
int aa=Integer.parseInt(sb.toString());
if(sum==aa)
System.out.println("palindrome");
else
System.out.println("not palindrome");
}
}
