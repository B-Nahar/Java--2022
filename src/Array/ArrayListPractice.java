package Array;


import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[]args){

        ArrayList<Integer> a = new ArrayList<Integer>();

        a.add(5);
        a.add(4);
        a.add(9);
        a.add(23);
        a.add(8);
        for(int i = 0; i<a.size();i++){

            System.out.println(a.get(i));
        }

        a.remove(3);
        for(int i = 0; i<a.size();i++){

            System.out.println(a.get(i));
        }


    }
}
