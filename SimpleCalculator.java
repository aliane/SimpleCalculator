//import java.util.Scanner;

public class SimpleCalculator {
  
  public static void main(String[] args) {
    String operation = "";
    double n1 = 0;
    double n2 = 0;
    
    for (int i=0; i<args.length; i++){
      n1 = Double.parseDouble(args[0]);
      n2 = Double.parseDouble(args[2]);
      operation = args[1];
    } 
    
    switch (operation){
      //add two numbers
      case "+":
        System.out.println("Your answer is " + (n1 + n2));
        break;
      
        //subtract two numbers
      case "-":
        System.out.println("Your answer is " + (n1 - n2));
        break;
       
        //divide two numbers
      case "/":
        if(n2!=0)
        System.out.println("Your answer is " + (n1 / n2));
        else
          System.out.println(" you can't devide a number by zero");
        break;
        
      //multiply two numbers
      case "*":
        System.out.println("Your asnwer is " + (n1 * n2));
        break;
        
       //print this when all cases does not apply 
      default:
        System.out.println("Use a correct operator");
        break;
    }
  }
}