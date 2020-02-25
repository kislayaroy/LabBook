class Difference
{
	public static void main(String arg[])
	{
	Difference difference=new Difference();
	int result=difference.calculateDifference(2);
	System.out.println(result);
	}

	public int calculateDifference(int number)
	{
		double sum=0;
		double sum1=0;
		double sum2=0;

		for(int loop1=1;loop1<=number;loop1++)
		{
			sum1=sum1+Math.pow(loop1,2);
		}
		
		for(int loop2=1;loop2<=number;loop2++)
		{
			sum2=sum2+loop2;
		}
		sum2=Math.pow(sum2,2);
		sum=sum1-sum2;
		return(int)	sum;	
	}
}
