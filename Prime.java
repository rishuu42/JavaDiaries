import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int a = myObj.nextInt();
        int div = 1;
        int check=0;
        for(int i=1; i<a; i++) {
            if(a%i==0) {
                check++;
            }
        }
        if(check==1) {
            System.out.print("Prime");
        } else {
            System.out.print("Not Prime");
        }

    }
}
