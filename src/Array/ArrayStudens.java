package Array;

import java.util.ArrayList;

public class ArrayStudens {

    public  static  void main(String [] args){

        // Array of Students
        String[] a= new String[3];
        a[0] = "Jon";
        a[1] = "David";
        a[2] ="Kin";

        System.out.println(a[1]);
        System.out.println("Length of a is :" + a.length);

         // Leo
        //ArrayList of Students
         ArrayList<String> b = new ArrayList<String>();
         b.add("Jon");
        b.add("David");
        b.add("Kin");
        b.add("Leo");
        b.add("Jose");

        System.out.println(b. get(1));
        System.out.println("The length of b is:" +b.size());

        // print ArryList b

        for(int i=0; i <b.size(); i++){
            System.out.println(b.get(i));
        }

        //print Array a
        for(int j=0; j< a.length; j++ ){

            System.out.println(a[j]);
        }
    }
}
