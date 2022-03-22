package Feb16;

public class SumPractice {
    int i =60;
    public static void main(String[]args){

        System.out.println("Sum");
        SumPractice ref = new SumPractice();
        ref.sum();
        ref.del();
        System.out.println(ref.i);
    }
       void del(){
        System.out.println("del");
       }
    void sum(){
        int a =5;
        int b = 10;
        int c = a+b;
        System.out.println(c);

    }
}
