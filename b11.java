import java.io.*;
import java.util.*;
class b11
{
public static void main(String args[])
{
int n=new Scanner(System.in).nextInt();
int c=0;
for(int i=2;i<n;i++)
{
if(n%i==0)
c++;
}
if(c==0)
System.out.println("prime");
else
System.out.println("not a prime");
}
}
