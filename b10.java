import java.io.*;
import java.util.*;
class b10
{
public static void main(String args[])
{
int n=new Scanner(System.in).nextInt();
int c=0;
while(n>0)
{
c++;
n=n/10;
}
System.out.println(c);
}
}
