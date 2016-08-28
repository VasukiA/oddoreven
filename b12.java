import java.io.*;
import java.util.*;
class b10
{
public static void main(String args[])
{
int n=new Scanner(System.in).nextInt();
String s=String.valueOf(n);
StringBuffer sb=new StringBuffer(s).reverse();
String ans=sb.toString();
if(s.equals(ans))
System.out.println("equal");
else
System.out.println("not equal");
}
}
