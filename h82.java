import java.io.*;
import java.util.*;
class h82
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
int occur=0;
int c=1;
int ans[]=new int[50];
int in=0;
for(int i=0;i<a.length;i++)
{
occur=0;
c=1;
for(int j=0;j<i;j++)
{
if(a[i]==a[j])
{
occur=occur+1;
}
}
if(occur==0)
{
for(int k=i+1;k<n;k++)
{
if(a[i]==a[k])
{
c=c+1;
}
}
ans[in++]=a[i];
}
}
Arrays.sort(ans);
System.out.println(ans[ans.length-1]);
}
}
