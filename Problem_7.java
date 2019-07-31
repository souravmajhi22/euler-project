// program:10001st prime
public class Problem_7 
{
	public static void main(String[] args)
	{
		int c=0,freq=0;
		for(int i=1;i>0;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				freq++;
			}
			if(freq==10001)
			{
				System.out.println("  the 10001st prime number is  "+i );
				break;
			}
			c=0;	
		}
	}
}
