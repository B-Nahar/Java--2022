package youTube;

public class AssignCalculation {


   //void sum(int x, int y){
     System.out.println(x+y);
   }
    void sum(int x, int y, int z){
        System.out.println(x+y+z);

    }
    //void sum(double x, double y){
        System.out.println(x+y);

    }
    //void sum(double x, double y, double z){
        System.out.println(x+y+z);

    }
    //public static void main(String []args){

        AssignCalculation cal = new AssignCalculation();
        cal.sum(10,20,30);
        cal.sum(10.10,10.20,10.30);
        cal.sum(10,20);
        cal.sum(10.10,10.20);
    }
}
