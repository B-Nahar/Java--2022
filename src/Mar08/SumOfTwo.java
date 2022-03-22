package Mar08;

public class SumOfTwo {
    public static void main(String[]args){

        SumOfTwo ref = new SumOfTwo();
        ref.sum (12,13);
        ref.sum(11,1);
        ref.sum(324323,2314);
        ref.sum(34235,2343.23);
         ref.sum(323.22, 3431.43);
         ref.sum(2324.22, 2413);
         ref.sum(12,16,46);
         ref.sum(98.34,23.67);

    }
    //Overleading

    void sum(int a, int b){
        System.out.println(a+b);


    }
    void sum(int a, double b){
        System.out.println(a+b);
    }
    void sum(double a, double b){
        System.out.println(a+b);
    }
    void sum(double a, int b){

        System.out.println(a+b);
    }

    void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }

}
