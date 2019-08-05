// program:Largest prime factor
public class Problem_3 
{
	  public static void main(String[] args)
	  {
	        long num = 600851475143L;
	        long i = 3,max;
	        for ( ; i <Math.sqrt(num);i=i+2)
	        {
	            while (num % i == 0) 
		    {
	                num /= i;
	            }
	        }
	        if(num>2)
	      {
	         max=num;
	         System.out.println("largest prime factor is ="+ max);
	      }
	}
}
// output : 6857
