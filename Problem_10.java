// program:Summation of primes
public class Problem_10
{
	 public static void main(String args[])
  	  {
		int i,j,c=0;long s=2;
		        for(i=3;i<2000000;i=i+2)
		        {
		            for(j=3;j<=Math.sqrt(i);j=j+2)
		            {
		                if(i%j==0)
		                c=1;
		            }
		            if(c==0)
		            s=s+i;
		            c=0;
		        }
		        System.out.println("Sum of all primes less than 2000000 is :"+s);
	    }
}
//output : 142913828922
