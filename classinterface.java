import java.util.Scanner;

interface A {
    void set(int x, int y);
}

interface B {
    void set(double length);
}

class Circle implements A, B {
    private int x, y;
    private double r;
    private static int count = 1;
    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void set(double length) {
        this.r = length;
    }

    public void display() {
        System.out.println("Circle " + count + ":");
        System.out.println("\tCenter Coordinates: (" + x + ", " + y + ")");
        System.out.println("\tRadius Length: " + r);
        count++;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle c1 = new Circle();
        Circle c2 = new Circle();

        System.out.println("Enter parameters for Circle 1:");
        System.out.print("Enter x-coordinate: ");
        int x1 = scanner.nextInt();
        System.out.print("Enter y-coordinate: ");
        int y1 = scanner.nextInt();
        System.out.print("Enter radius: ");
        double r1 = scanner.nextDouble();
        c1.set(x1, y1);
        c1.set(r1);

        System.out.println("Enter parameters for Circle 2:");
        System.out.print("Enter x-coordinate: ");
        int x2 = scanner.nextInt();
        System.out.print("Enter y-coordinate: ");
        int y2 = scanner.nextInt();
        System.out.print("Enter radius: ");
        double r2 = scanner.nextDouble();
        c2.set(x2, y2);
        c2.set(r2);
        System.out.println("\n--------------------------------------\n");

        c1.display();
        c2.display();

        scanner.close();
    }
}
