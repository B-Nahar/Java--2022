package feb22;

public class StaticNonStatic {

    static int a = 5;
    int b = 10;
    public static void main(String[]args){
        System.out.println(a);
        StaticNonStatic ref = new StaticNonStatic();

        System.out.println(ref.b);
        ref. m1();
        m2();
    }
    void m1(){
        System.out.println("non static");
    }
    static void m2(){
        System.out.println("static");
    }
}
