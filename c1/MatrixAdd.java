import java.util.Scanner;
public class MatrixAdd
{
	public static void main(String[] args)
	{
		int p,q,m,n;
		System.out.println("PONNU AUGUSTINE");
		System.out.println("23MCA044");
		System.out.println("13/02/24");
		System.out.println("MatrixAdd");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of rows in matrix1:");
		p=s.nextInt();
		System.out.println("Enter number of columns in matrix1:");
		q=s.nextInt();
		System.out.println("Enter number of rows in matrix2:");
		m=s.nextInt();
		System.out.println("Enter number of columns in matrix2:");
		n=s.nextInt();
		if(p==m && q==n)
		{
			int a[][]=new int[p][q];
			int b[][]=new int[m][n];
			int c[][]=new int[m][n];
			System.out.println("Enter elements of matrix1:");
			for(int i=0;i<p;i++)
			{
				for(int j=0;j<q;j++)
				{
					a[i][j]=s.nextInt();
				}
			}
			System.out.println("Enter elements of matrix2:");
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					b[i][j]=s.nextInt();
				}
			}
			System.out.println("First Matrix:");
			for(int i=0;i<p;i++)
			{
				for(int j=0;j<q;j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println("");
			}
			System.out.println("Second Matrix:");
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					System.out.print(b[i][j]+" ");
				}
				System.out.println("");
			}
			for(int i=0;i<p;i++)
			{
				for(int j=0;j<n;j++)
				{
					for(int k=0;k<q;k++)
					{
						c[i][j]=a[i][j]+b[i][j];
					}
				}
			}
			System.out.println("Matrix after addition:");
			for(int i=0;i<p;i++)
			{
				for(int j=0;j<n;j++)
				{
					System.out.print(c[i][j]+" ");
				}
				System.out.println("");
			}
		}
		else
		{
			System.out.println("Addition is not possible");
		}
	}
}
