// program:Summation of primes
public class Problem_10
{
	public static boolean primecheck(long n)
    {
	 int counter=0;
		for(long i=1;i<=(long)Math.sqrt(n);i++) 
		{
			if(n%i==0)
				counter++;
			if(counter>1)
				return false;
		}
			return true;
	}
	public static void main(String args[])
    {
        
        long sum = 0;
        for(long i = 3 ;i<=2000000;i+=2) // no even number can be prime except 2
        {
            if(primecheck(i))
            {
                sum = sum +i;
            }
        }
        System.out.println(sum+2); //because 2 is not included
   }
}
//output : 142913828922
