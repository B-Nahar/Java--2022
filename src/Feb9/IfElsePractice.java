package Feb9;

public class IfElsePractice {

    // If below 12, print Boston
    // If below 17, print New york
    // Otherwise, print MaryLand
    // cause // result
    public static void main(String []args){

        int number = 100;
        if(number<12){
            System.out.println("Boston");
        } else if (number<17){
            System.out.println("New york");
        } else {
            System.out.println("MaryLand");
        }
    }
}
