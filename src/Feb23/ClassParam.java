package Feb23;

public class ClassParam {

    void sum(int a, int b){
        System.out.println(a+b);
    }

    public static void main(String[]args){

        ClassParam ref = new ClassParam();
        ref.sum(4,3);
        sum1(23.4,24.6);
        ref.name("Anna");
        System.out.println(ref.a);
        System.out.println(ref.a*10);
        int b = 12;
        System.out.println(b*10);
        System.out.println(b*ref.a);
    }

   static void sum1(double a, double b){
        System.out.println(a+b);
   }
   void name(String name){
        System.out.println("My name is:"+name);
   }
   int  a =5;
}
