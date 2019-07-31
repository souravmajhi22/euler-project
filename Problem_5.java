// program: Smallest multiple
public class Problem_5 
{
	public static void main(String[] args)
	{
		int c=0,f=0;
		for(int i=1;i>0;i++)
 		{
			for(int j=1;j<=20;j++)
			{
				if(i%j==0)
					c++;
			}
			if(c==20)
			{
				System.out.println(i+"  is the smallest number that can be divided by each of the numbers from 1 to 20 without any remainder");
				f=1;
				break;
			}
			c=0;
				}
		if(f==0)
		{
			System.out.println("no number is found that can be divided by each of the numbers from 1 to 20 without any remainder");
		}
	}
 }
