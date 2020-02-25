class Sum
{
	public static void main(String arg[])
	{
	Sum sum=new Sum();
	int result=sum.calculateSum(5);
	System.out.println(result);
	}
	

	public int calculateSum(int number)
	{
		int calsum=0;
		for(int loop=1;loop<=number;loop++)
		{
			if((loop%3==0)||(loop%5==0))
			{
				calsum=calsum+loop;
			}
		}
		return calsum;
	}
}