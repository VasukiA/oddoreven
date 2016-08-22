import java.io.*;
import java.util.*;
class player14
{
public static void main(String args[])
{
String str=new Scanner(System.in).next();
StringBuffer sb=new StringBuffer(str);
sb=sb.reverse();
for(int i=0;i<sb.length();i++)
{
char c=sb.charAt(i);
if(c=='a')
{
sb=sb.deleteCharAt(i);
}
else if(c=='e')
{
sb=sb.deleteCharAt(i);
}
else if(c=='i')
{
sb=sb.deleteCharAt(i);
}
else if(c=='o')
{
sb=sb.deleteCharAt(i);
}
else if(c=='u')
{
sb=sb.deleteCharAt(i);
}

}
System.out.println(sb);
}
}
