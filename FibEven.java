import java.util.Scanner;
class Fib extends Thread
{
	int f,n1=0,n2=1,n3;
	Fib(int c)
	{
		this.f=c;
	}
	public void run()
	{
		System.out.println("fibonacci is:");
		System.out.println(+n1);
		System.out.println(+n2);
		for(int i=2;i<this.f;++i) 
		{
			n3=n1+n2;
			System.out.println(+n3);
			n1=n2;
			n2=n3;
		}
	}
}
class even extends Thread
{
	int range;
	even(int range)
	{
		this.range=range;
	}
	public void run()
	{
		System.out.println("even num is:");
		for(int i=0;i<this.range;i++)
		{
			if(i%2==0)
			{
				System.out.println(+i);
			}
		}
	}
}
public class FibEven
{
	public static void main(String [] args)
	{
		System.out.println("PONNU AUGUSTINE   23MCA044  15/04/24");
		System.out.println();
		int c,range;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the count of Fibinooci");
		c=sc.nextInt();
		Fib fi=new Fib(c);
		System.out.println("enter the range of even number");
		range=sc.nextInt();
		even ev = new even(range);
		fi.start();
		ev.start();
	}
}
