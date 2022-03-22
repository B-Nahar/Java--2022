package feb22;

public class Calculator {

    public static void main(String []args){

       sum(56, 67);
       multiply(35,2);
       sum(23,70);
       multiply(20,10);
    }

    static void multiply(int a, int b){
        System.out.println(a*b);
    }

    static void sum(int a,int b){

        System.out.println(a+b);
    }
}
