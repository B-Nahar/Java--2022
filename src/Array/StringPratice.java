package Array;

public class StringPratice {

    public static void main(String [] args){
        int a =5;
        int b= 10;
        double c = 12.5;
        String d = "Car wash at cheap ratea";
        char e = 'M';

        System.out.println(d.length());

        String [ ] f= d.split(" ");
        for (int g =0;g<f.length; g++){
            System.out.println(f[g]);
        }

        String word = "China is a big country";
        System.out.println(word.contains("book"));
        System.out.println(word.substring(5,10));
        System.out.println(word.substring(5));
        System.out.println(word.substring(0,3));
        System.out.println(word.substring(0));

String x = "It's too cold here right now";
System.out.println(x.toUpperCase());
        System.out.println(x.toLowerCase());
        System.out.println(x.charAt(5));

    }
}
