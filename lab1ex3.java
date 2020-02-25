class NumberCheck {
	public static void main(String args[]) {
    	   
           NumberCheck n=new NumberCheck();
           int num=134468;
           boolean flag=n.checkNumber(num);
           if(flag){
               System.out.println("Digits are not in increasing order.");
           }else{
               System.out.println("Digits are in increasing order.");
           }
  
        }


	   public boolean checkNumber(int number) {
	   boolean flag=false;
       int currentDigit = number % 10;
       number = number/10;
        
       
       while(number>0){
           
           if(currentDigit < number % 10){
               flag = true;
               break;
           }
           currentDigit = number % 10;
           number = number/10;
       }
       return flag;
}
       
       
  }

