import java.util.*;
import java.lang.String;
class Buffer
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
StringBuffer str1=new StringBuffer("java");
StringBuffer str2=new StringBuffer("Language");
System.out.println(str1);
System.out.println(str2);
str1.append(str2);
System.out.println(str1);
}
}