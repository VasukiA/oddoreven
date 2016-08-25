import java.io.*;
import java.util.*;
class pro52
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int x1=sc.nextInt();
int y1=sc.nextInt();
int x2=sc.nextInt();
int y2=sc.nextInt();
int x3=sc.nextInt();
int y3=sc.nextInt();
int x4=sc.nextInt();
int y4=sc.nextInt();
int dx=x4-x1;
int dy=y2-y1;
if(dx==dy)
System.out.println("square");
else
System.out.println("not square");
}
}
