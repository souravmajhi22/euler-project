//program:Multiples of 3 and 5
public class Problem_1 
{
	public static void main(String[] args)
	{
		
		int sum=0;
		for (int i=3;i<1000;i++)
		{
			if((i%3==0)||(i%5==0))
			{
				sum=sum+i;	
			}
		}
		System.out.println(sum);
	}
}
