//Fibonaaci Series
//Rishitt Gupta
//R2142220352
//500107002
//18th August 2023
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        int a=1;
        int b=1;
        Scanner obj = new Scanner(System.in);
        System.out.print("Please Enter 10: ");
        int c = obj.nextInt();
        int temp=0;
        System.out.print("The Fibonacci Series till 70 is: \n");
        System.out.print("-----------------------------------\n");
        if(c==1)
        {
            System.out.println("1:"+a);
        }
        else if(c==2)
        {
            System.out.println("1:"+a+"\n"+"2:"+b);
        }
        else if(c>3 || c==3)
        {
            System.out.print("1:" + a + "\n" + "2:" + b + "\n");
            for(int i = 3;i<=c;i++)
            {
                temp=a+b;
                a=b;
                b=temp;
                if(temp%2==0)
                {
                    System.out.print(i+":"+temp+"*"+"\n");
                }
                else{
                    System.out.print(i+":"+temp+"\n");
                }
               
             }
        }
        System.out.print("-----------------------------------\n");
        System.out.println("Series Ended");
        
    }
}
