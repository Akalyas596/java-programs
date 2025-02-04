import java.util.Scanner;
class Fibonacci{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a=0,b=1,c;
for(int i=0;i<=n;i++)
{
c=a+b;
a=b;
b=c;
System.out.println(a+"");
}
}
}