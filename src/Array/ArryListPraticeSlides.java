package Array;

import com.sun.deploy.net.MessageHeader;

import java.util.ArrayList;

public class ArryListPraticeSlides {

    public static void main(String[]args){

        //    ArrayList<String> cars = new ArrayList<String>();
        //    cars.add("Volvo");
        //    cars.add("BMW");
        //    cars.add("Ford");
        //    cars.add("Mazda");
        //    System.out.println(cars);

       String[] a = new String[4];

       a[0]="BMW";
       a[1]="Ford";
       a[2]="Tyota";
       a[3]="Tesla";

       System.out.println(a[3]);
       for(int i=0;i<a.length;i++){
           System.out.println(a[i]);
       }

       ArrayList<String > b =new ArrayList<>();
       b.add("Mango");
        b.add("Orange");
        b.add("PineApple");
        b.add("Banana");
        b.add("Grape");

        System.out.println(b);
        for(int j=0;j<b.size();j++){

            System.out.println(b.get(j));
        }


        //remove, clear, set
    }
}
