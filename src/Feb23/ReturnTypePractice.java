package Feb23;

public class ReturnTypePractice {

    public static void main(String []args){
        ReturnTypePractice ref = new ReturnTypePractice();
        ref.sum(5,7);
         int x= ref.sum1(5,7);
         System.out.println(ref.sum1(5,13)+12);
         System.out.println(ref.printName());
        System.out.println(ref.sum1(5,13)+30);
        System.out.println(ref.printName()+"Anna");
    }

    void sum(int a, int b){
        int c = a+b;
        System.out.println(c);
    }

    int sum1(int a, int b){
        int c= a+b;
        return c;
    }

    String printName(){
        String name ="Arko";
        return name;
    }
}

