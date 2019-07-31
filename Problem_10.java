// program:Summation of primes
public class Problem_10
{
	public static boolean primecheck(long n)
    {
        boolean result = true;
        for (int i = 3; i<=Math.sqrt(n);i+=2)
        {
            if (n%i==0)
            {
                result=false;
                break;
            }
        }
        return result;
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
