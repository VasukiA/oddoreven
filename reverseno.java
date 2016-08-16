import java.io.*;
import java.util.*;
class reverseno
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n>0)
{
while(n>0)
{
int x=n%10;
System.out.print(x);
n=n/10;
}
}
else
{
  System.out.println("negative no")
}
}
}
}
