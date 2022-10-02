import java.util.*;

class Array{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int pos=0,i,j;
		for(i=0;i<n-1;i++)
		{
			int smallest=999999;
			for(j=i;j<n;j++)
			{
				if(a[j]<smallest)
				{
					smallest=a[j];
					pos=j;
				}
			}
			//System.out.println(a[pos]);
			int temp=a[pos];
			a[pos]=a[i];
			a[i]=temp;
		}
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}