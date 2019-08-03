// program:Largest prime factor
public class Problem_3 
{
	  public static void main(String[] args)
	  {
	        long n=600851475143L,c=0;
		for(long i=n-2;i>=1;i=i-2)
		{
			if(n%i==0)
			{
			for(long j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					c++;
					if(c>2)
					break;
				}
			}
			if(c==2)
			{
				System.out.println(i);
				break;
			}
			c=0;
			}	
		}
	}
}
// output : 6857
