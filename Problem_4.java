// program:Largest palindrome product
public class Problem_4 
{
	public static int reverse(int n)
	{
		int r=0,d;
		while(n>0)
		{
			d=n%10;
			r=r*10+d;
			n=n/10;
		}
		return r;
	}
	public static void main(String args[]) 
	{
		int  p;
		int m=0;
			for(int i=999;i>=100;i--)
			{
				for(int j=i;j>=100;j--)
				{
					p=i*j;
					int k=reverse(p);
					if(p==k)
					m=Math.max(m, k);
				}
			}
	System.out.println(m);
	}
}
