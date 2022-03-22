package Quiz;

public class quiz4 {

    // Count the total number of digits in 67687
    // 67687/10 = 6768; 6768/10 = 676; 676/10 = 67; 67/10 = 6;

    public static void main(String [] args){

       int counter = 1;

       for( int i = 67687; i> 10; i= i/10){

           counter++;
       }
       System.out.println(counter);
    }
}
