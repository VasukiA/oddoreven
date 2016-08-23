import java.io.*;
import java.util.*;
class hunder6
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
int b[]=new int[50];
int aa=0;
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(a[i]==a[j])
{
b[aa++]=a[j];
}
}
}
System.out.println(b[0]);
}
}
