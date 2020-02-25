class PowerOfTwo { 
	public static void main(String args[]) 
	    { 
	    	PowerOfTwo po=new PowerOfTwo();
	        if (po.isPowerOfTwo(8)) 
	            System.out.println("Yes"); 
	        else
	            System.out.println("No");
	    } 
	    

	public boolean isPowerOfTwo(int n) 
	    { 
	        if (n == 0) 
	            return false; 
	          
	        while (n != 1) 
	        { 
	            if (n % 2 != 0) 
	                return false; 
	            n = n / 2; 
	        } 
	        return true; 
	    } 
	   
	    
}
