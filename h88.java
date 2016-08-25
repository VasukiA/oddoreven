import java.io.*;
import java.util.*;
class h88
{
public static void main(String args[])
{
String s1=new Scanner(System.in).next();
StringBuffer sb=new StringBuffer(s1);
String s2=sb.reverse().toString();
char c[]=s2.toCharArray();
Set<Character> set=new LinkedHashSet<Character>();
for(int i=0;i<s1.length();i++)
{
set.add(c[i]);
}
Iterator it=set.iterator();
while(it.hasNext())
{
System.out.print(it.next());
}
}
}
