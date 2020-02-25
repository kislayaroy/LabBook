import java.util.Arrays;

class S_Array
{

	public static void main(String arg[])
	{
		S_Array smallestelement=new S_Array();
		int array[]={5,2,7,1,9};
		int result=smallestelement.getSecondSmallest(array);
		System.out.println(result);
	}
	
	
	public int getSecondSmallest(int array[])
	{
		Arrays.sort(array);
		int secondsmallest=array[1];
		return secondsmallest;
	}
}