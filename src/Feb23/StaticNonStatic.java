package Feb23;

public class StaticNonStatic {

    int i = 14;
    static int j = 25;
    public static void main(String[]args){

        m1();
        m2();
        StaticNonStatic a = new StaticNonStatic();
        a.m3();
        a.m4();

        System.out.println(j);
        System.out.println(a.i);
    }

    static void m1(){

        System.out.println("m1 static");

    }
    static void m2(){
        System.out.println("m2 static");
       m1();
    }

    void m3(){
        System.out.println("m3 non static");
        m2();
        m1();
        m4();
    }
    void m4(){
        System.out.println("m1 non static");

    }
}
