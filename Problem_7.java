// program:10001st prime
public class Problem_7 
{
		public static boolean checkprime(int  a)
	{
		  int c=0;
		for(long i=1;i<=(long)Math.sqrt(a);i++) 
		{
			if(a%i==0)
				c++;
			if(c>1)
				return false;
		}
			return true;
	}
	public static void main (String[]args)
	{
		int f=1;
		for(int i=3;i>0;i=i+2)
	{
		if(checkprime(i)==true)
		 f++;
	if(f==10001)
	{
		System.out.println("10001st prime number is: "+i);
		break;
	}
	}
	}
}
