// program: Smallest multiple
public class Problem_5 
{
	static long findgcd(long x,long y)
	 {
		 if(x%y!=0)
			 return findgcd(y,x%y);
		 else 
			 return y;
	 }
	 static long lcm(long n)
	 {
		 long result=1;
		 for(int i=1;i<=n;i++)
		 {
			 result =(result*i)/(findgcd(result,i));
		 }
		 return result;
	 }
	public static void main(String[] args)
	{		
	long n =20;
	System.out.println(lcm(n));
	}
}
// output : 232792560
