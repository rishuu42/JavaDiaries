import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.print("Enter Operand 1: ");
    int a = myObj.nextInt(); 
    System.out.println("-------------------------------");
    System.out.print("Enter Operand 2: ");
    int b = myObj.nextInt();
    System.out.println("-------------------------------");
    System.out.println("Enter Operation\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
    int c = myObj.nextInt();
    if(c==1)
    {
        int d = a + b;
        System.out.println("Addition: " + d);
        System.out.println("-------------------------------");
    }
    else if(c==2)
    {
        int d = a - b;
        System.out.println("Subtraction: " + d);
        System.out.println("-------------------------------");
    }
    if(c==3)
    {
        int d = a * b;
        System.out.println("Multiplication: " + d);
        System.out.println("-------------------------------");
    }
    if(c==4)
    {
        int d = a/b;
        System.out.println("Division: " + d);
        System.out.println("-------------------------------");
    }
    }
}
