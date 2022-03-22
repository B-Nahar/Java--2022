package Quiz;

public class quiz7 {
    public static void main(String args[]){
        //Fibonacci up to 10 numbers
        // 1 1 2 3 5 8 13 21

        int num1 = 1;
        int num2 = 1;
        System.out.println(num1);
        System.out.println(num2);

        for( int i = 1; i <= 10; i++){
            int num3 = num1 + num2;
            System.out.println(num3);

            num1 = num2;
            num2 = num3;
        }
    }




}
