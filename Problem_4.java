// program:Largest palindrome product
public class Problem_4 
{
	public static long reverse(long n)
	{
		long r=0,d;
		while(n>0)
		{
			d=n%10;
			r=r*10+d;
			n=n/10;
		}
		return r;	
	}
	public static long largestPalindromeproduct(long a,long b)
	{
		long  i,j,p,m=0;
		for(i=a;i>99;i--)
		{
			for(j=b;j>=i;j--)
			{
				p=i*j;
				if(isPalindrome(p))
				m=(long)Math.max(m, p);	
				}
			}
			return m;
	}
	public static boolean isPalindrome(long n)
	{
		return reverse(n)==n;
	}
	public static void main(String args[]) 
	{
		long lp=largestPalindromeproduct(999,999);
		System.out.println(lp);
		
	}
}
