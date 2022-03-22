package Quiz;

public class quiz13 {
    public static void main(String [] args){

        //The basic insurance charge is $500.
        //Number of accidents Accident Surcharge
        //     1      50
        //     2    120
        //     3    220
        //     4    370
        //     5    570
        //     6 or more No insurance

        int a = 0;
        if(a == 0){
            System.out.println(500);
        } else if(a == 1){
            System.out.println(500 + 50);
        } else if (a == 2){
            System.out.println(500 + 120);
        } else if (a == 3){
            System.out.println(500 + 220);
        } else if( a == 4){
            System.out.println(500 + 370);
        } else if (a == 5){
            System.out.println(500 + 570);
        } else if( a == 6){
            System.out.println("No insurance");
        } else {
            System.out.println("Something wrong");
        }
    }
}
