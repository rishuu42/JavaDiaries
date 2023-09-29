interface myDisp {
    void disp();
}
class myClass implements myDisp {
    public void disp() {
        System.out.println("Hello");
    }
}

class Main {
    public static void main(String[] args) {
        myClass m = new myClass();
        m.disp();
    }
}
