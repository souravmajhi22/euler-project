public class Problem_3 
{
	  public static void main(String[] args)
	  {
	        long num = 600851475143L;
	        long i = 2;
	        for ( ; i <= num; i++)
	        {
	            while (num % i == 0) {
	                num /= i;
	            }
	        }
	        System.out.println(i-1);
	    }
}
