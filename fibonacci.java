import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        Scanner obj = new Scanner(System.in);
        int c = obj.nextInt();
        int temp=0;
        if(c==1)
        {
            System.out.println(a);
        }
        else if(c==2)
        {
            System.out.println(a +" "+ b);
        }
        if(c>3 || c==3)
        {
            System.out.print(a+ " "+ b + " ");
            for(int i = 0;i<c-2;i++)
            {
                temp=a+b;
                a=b;
                b=temp;
                System.out.print(temp + " ");
             }
        }
        
    }
}
