package orgElevate.techhub;
import java.util.*;
public class CalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		  try {// I am writing  this code in try block becouse of Arithmetic exception occurs here 
			     //divisible by 0  that's why  
			   Scanner sc=new Scanner (System.in);
			   System.out.println("Enter two Number  from user to perfor following operations");
				  int a=sc.nextInt();//give first input  from user 
				  int b=sc.nextInt();
			    
			   do {
				  
				    System.out.println("1:Addition");
				    System.out.println("2:Substraction");
				    System.out.println("3:Multiplicatin");
				    System.out.println("4:Division");
				    System.out.println("5: Modulo");
				    System.out.println("0: Exit");
				    System.out.println("Enter your choice ");
				     int ch=sc.nextInt();
				    switch(ch)
				    {
				    
				    case 1 :
				    	
				    	System.out.println("Result is="+(a+b));//  perform addition operation here 
				    	break;
				    case 2:
				    	System.out.println("Result is="+(a-b));//same like as substraction 
				    	break;
				    case 3:
				    	System.out.println("Result is="+(a*b));// perform multiplication 
				    	break;
				    case 4:
				    	 if (b != 0)//handel here Arithmetic  Exception
	                            System.out.println("Result is = " + (a / b));//and division  here 
	                        else
	                            System.out.println("Cannot divide by zero");
	                        break;
				    	
				    case 5:
				    	
				    	if (b != 0)//handel here Arithmetic  Exception
                            System.out.println("Result is = " + (a % b));
                        else
                            System.out.println("Cannot modulo by zero");//  modeulo  
				    	break;
				    case 0:
				    	System.out.println("Exit");// turminate  do while loop 
				    	break;
				    	
				    	default :
				    		System.out.println("Enter valid choice "); //if user enter wrong choice  that time this case   will be executed 
				   }
				    // Exit condition for the loop
	                if (ch == 0) 
	                {
	                    break;  // exit from do-while loop
	                }
				    
				    
			   
			   }while(true);
		  
		  }catch(Exception ex) ///this block show Exception error thows here 
		  {
		  System.out.println("Error occours "+ex.getMessage());
		  }
		

	}

}
