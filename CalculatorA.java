import java.util.*;

public class CalculatorA{
   public static void main(String[] args){
       int number1 =0 ,number2 = 0,result;
       System.out.println("Welcome to Calculator");
       do{
           try{       
		Scanner scanner=new Scanner(System.in);
       
                System.out.println("Press 1 for Addition \n 2 for Subtraction \n 3 for Multiplication \n 4 for Division \n 5 for Exit");
                
		int choice=scanner.nextInt();  
		
		if(choice == 5)
			System.exit(0);
		else {
		        if(choice > 0 && choice < 5){
			    System.out.println("Enter first numbers");
                             number1=scanner.nextInt();
                             System.out.println("Enter second numbers");
                             number2=scanner.nextInt();
                        }
                             
                switch(choice){
                     case 1 : result=number1+number2;
                              System.out.println("Addition : "+result);
                              break;
                    case 2 : result=number1-number2;
                             System.out.println("Subtraction : "+result);
                             break;
                    case 3 : result=number1*number2;
                             System.out.println("Multiplication : "+result);
                             break;
                    case 4 : try{
                                  result=number1/number2;
                                  System.out.println("Division : "+result);
                             }
                             catch(ArithmeticException e){
                                  System.out.println("Warning: Input zero is not allowed for this function"); 
                             }
                             break;
               
          	    default: 
				System.out.println("No such option available");  
				break;
                 }
             }
		}
             catch(Exception e){
                   System.out.println("Warning: Strings are not allowed");
             }
		
       }while(true);
  }
}       