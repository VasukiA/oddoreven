import java.io.*;
import java.util.*;
class pro2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int len=String.valueOf(n).length();
int a[]=new int[len];
System.out.println("enter k:");
int k=sc.nextInt();
int ind=0;
while(n>0)
{
int r=n%10;
a[ind++]=r;
n=n/10;
}
String s="";
Arrays.sort(a);
for(int i=0;i<ind;i++)
{
s+=a[i];
}
System.out.println(s.substring(0,s.length()-k));
}
}
