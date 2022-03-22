package Feb9;

public class LoopAdvance {
    public static void main(String []args){
        // 9, 18,27,36,45,54,63,72,81,90
        //9*1,9*2....9*9,9*10;
        //Loop to perform any repetitive work
        //print 9, 10 times
        // 23, 10 times
        int a =1;
        while (a<=11){
            System.out.println(9*a);
            a++;
        }

        int b =1;
        while (b<=11){
            System.out.println(7*b);
            b++;
        }
        for(int c= 1; c<=11;c++){
            System.out.println(3*c);
        }
    }
}
