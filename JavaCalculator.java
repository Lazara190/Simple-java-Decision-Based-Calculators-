public class JavaCalculator 
{
    
    public static void main(String[] args)
    {
        System.out.printIn("Welcome to Java Calculator!");
        int operator, n1, n2;
        System.out.printIn("1 - Add \n 2 - Subtract \n 3 - Multiply \n 4 - Divide");
        System.out.print("Choose Operator: ");
        Scanner sc = new Scanner(System.in);
        operator = sc.nextInt();
        System.out.print("Enter first number : ");
        n1 = sc.nextInt();
        System.out.print("Enter second number : ");
        n2 = sc.nextInt();
        
        int result = 0; 
        switch(operator) {
            case 1: 
            result = n1 + n2;  
            
            case 2:
            result = n1 - n2;  
            
            case 3:
            result = n1 * n2;  
              
            case 4:
            result = n1 / n2;  

            default:
                System.out.printIn("Entered operator is not valid");

        }

        System.out.printIn("Result is : " + result);
        System.out.printInt("Thank you for using the Java Calculator!!");
    }
}
