import java.io.*;
import java.util.*;
class b19
{
public static void main(String args[])
{
int n=new Scanner(System.in).nextInt();
int f=1;
while(n>0)
{
f=f*n;
n--;
}
System.out.println(f);
}
}
