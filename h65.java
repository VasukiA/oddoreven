import java.io.*;
import java.util.*;
class h65
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("enter remove element:");
int r=sc.nextInt();
String s="";
for(int i=0;i<n;i++)
{
if(a[i]!=r)
{
s+=a[i]+" ";
}
}
System.out.println(s);
}
}
