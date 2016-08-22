import java.io.*;
import java.util.*;
class player6
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s1=sc.next();
String s2=sc.next();
String out="";
if(s1.length()==s2.length())
{
for(int i=0;i<s1.length();i++)
{
out=s1.replace(s1.charAt(i),s2.charAt(i));
s1=out;
}
if(out.equals(s2)
{
System.out.priintln(true);
}
else
{
  System.out.println(false);
}
}
else
{
System.out.println(false);
}
}
}
