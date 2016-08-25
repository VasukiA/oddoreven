import java.io.*;
import java.util.*;
class h72
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s1[]=sc.nextLine().split(" ");
String s2="";
String ans="";
for(int i=0;i<s1.length;i++)
{
s2=s1[i];
if(i%2!=0)
{
StringBuffer sb=new StringBuffer(s2);
sb=sb.reverse();
s2=sb.toString();
}
ans+=s2+" ";
}
System.out.println(ans);
}
}
