import java.util.*;
import java.lang.String;
class Test12
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
int target=s.nextInt();
for(int i=0;i<n-1;i++)
{
for(int j=i+1;j<n;j++)
{
if(a[i]+a[j]==target)
{
System.out.print(i+" "+j);
}
}
}
}
}
