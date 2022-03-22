package Feb16;

import java.util.Locale;

public class StringPractice {

    public static void main(String[]args){

        int a = 5;
        int b =10;
        double c = 12.5;
        String d ="Car Wash at cheap rates";
        char e = 'M';

        System.out.println(d.length());
        String []f = d.split("a");

        for(int g = 0; g<f.length;g++){
            System.out.println(f[g]);
        }

        String h = "China is a big country";
        System.out.println(h.contains("a"));
        System.out.println(h.contains("Cou"));
        System.out.println(h.substring(0,5));

        System.out.println(h.substring(0,10));
        System.out.println(h.substring(5));

        String x = "It's too cold here right now";
        System.out.println(x.toUpperCase());
        System.out.println(x.toLowerCase());
        System.out.println(x.charAt(5));
    }
}
