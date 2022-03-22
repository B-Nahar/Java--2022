package feb22;

public class StaticPractice {

    // accessModifier(oP) Static(op) void(/returnType) name(){}


    static void  a(){
        StaticPractice ref = new StaticPractice();
        ref.b();

    }

    void  b(){
        a();
        c();
    }

    void c(){
        b();
    }

    static void d(){
        a();
    }
}
