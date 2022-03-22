package feb22;

public class ClassX {

    public static void main(String[]args){

        ClassA a = new ClassA();
        a.sum();
        a.multiply();

        ClassB b = new ClassB();
        b.info();
        System.out.println(b.i);
        ClassX x = new ClassX();
        x.test();
    }

    void test(){

        System.out.println("Test print");
    }
}
