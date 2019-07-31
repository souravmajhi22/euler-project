public class Problem_6
{
	public static void main(String[] args)
	{
		int s1=0,s2=0;
		for(int i=1;i<=100;i++)
		{
			s1=s1+(i*i);
		}
		for(int i=1;i<=100;i++)
		{
			s2=s2+i;
		}
		System.out.println("Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is "+((s2*s2)-s1));
	}
}
