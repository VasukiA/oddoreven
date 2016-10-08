import java.io.*;
import java.util.*;
class b17
{
public static void main(String args[])
{
int c=0;
int n=new Scanner(System.in).nextInt();
int x=n;
while(n>0)
{
int y=n%10;
c+=y*y*y;
n=n/10;
}
if(x==c)
System.out.println("amstrong number");
else
System.out.println("not an amstrong number");
}
}
