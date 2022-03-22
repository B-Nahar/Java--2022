package Mar08;

public class ClassC extends ClassB{

    static int b = 25;
    public static void main(String []args){
ClassC ref3 = new ClassC();
        ref3.methotdC();
    }

    void methotdC(){

        ClassC ref3 = new ClassC();
        System.out.println(this.b);
        System.out.println(super.b);
    }
}
