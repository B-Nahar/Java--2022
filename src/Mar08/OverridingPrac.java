package Mar08;

public class OverridingPrac extends OverloadingPrac{

    public static void main(String[]args){

        OverridingPrac ovr = new OverridingPrac();
        ovr. execution();
    }

    void execution(){

        OverridingPrac ref = new OverridingPrac();
       super.methodA();
        this.methodA();
    }
    void methodA(){
        System.out.println("B1");
    }
}
