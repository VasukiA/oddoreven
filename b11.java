import java.io.*;
import java.util.*;
class b11
{
public static void main(String args[])
{
int n=new Scanner(System.in).nextInt();
String s=String.valueOf(n);
  String s1=new StringBuffer(s).reverse().toString();
if(s.equals(s1))
System.out.println("palindrome");
else
System.out.println("not palindrome");
}
}
