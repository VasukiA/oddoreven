import java.io.*;
import java.util.*;
class hunder12
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[50];
for(int i=0;i<50;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<50;i++)
{
for(int j=i+1;j<50;j++)
{
if(a[i]<a[j])
{
int t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}
System.out.println(a[4]);
System.out.println("enter k:");
int k=sc.nextInt();
System.out.println(a[k]);
}
}
