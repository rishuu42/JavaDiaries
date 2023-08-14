import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.print("Enter Operand: ");
    int a = myObj.nextInt();
    int fact = 1;
    for(int i=1;i<=a;i++)
    {
        fact=fact*i;
    }
    System.out.print("Factorial: "+ fact);
    }
}
