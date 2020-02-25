class Operator 
{ 
  public static void main(String[] args) 
    { 
	Operator operator=new Operator();
        int result=operator.sumOfCubes(2); 
        System.out.println(result); 
  
    } 
    public static int sumOfCubes(int number) 
    { 
        int sum = 0; 
        for (int loop=1; loop<=number; loop++) 
            sum += loop*loop*loop; 
        return sum; 
    } 
  
} 