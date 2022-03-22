package feb22;

public class Calculation {
    public static void main(String[]args){

        Calculation ref = new Calculation();
        ref.sum();
        ref.multiply();
        Class1 b = new Class1();
        b.methord1();
        Class2 c = new Class2();
        c.method2();

    }
    void sum(){

        int a = 2;
        int b = 5;
        System.out.println(a+b);
    }

    void multiply(){

        int a = 2;
        int b = 5;
        System.out.println(a*b);
    }
}
