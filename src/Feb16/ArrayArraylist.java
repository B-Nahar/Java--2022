package Feb16;

import java.util.ArrayList;

public class ArrayArraylist {

    public static void main(String [] args){

        String []a = new String[4];
        a[0] ="BMW";
        a[1]="Ford";
        a[2]="Tyota";
        a[3]="Teala";

        System.out.println(a[3]);

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

        ArrayList<String >b= new ArrayList<>();
        b.add("Mango");
        b.add("Orange");
        b.add("PineApple");
        b.add("Banana");
        b.add("Grape");
        b.add("Strawberry");
        b.set(0,"Blueberry");
        System.out.println(b);

        for(int j=0;j<b.size();j++){
            System.out.println(b.get(j));
        }
        // remove, clear,set
    }
}
