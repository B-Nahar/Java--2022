package Loop;

public class quiz9 {
    //  the employee's get $10000
    // more than 5 years the employees will get 5% bonus
    // more than 10 years the employees will get 10% bonus
    // more than 15 years the employees will get 15% bonus
    public static void main(String args[]){

        int y= 11;
        if (y>5){
            System.out.println("employees will get 5% bonus");
        } else if (y>10){

            System.out.println("employees will get 10% bonus");

        } else {
            System.out.println("employees will get 15% bonus");
        }

        int b= 11;
        if(b<5){
            System.out.println("employees will get 5% bonus");
        } else if (b>10){
            System.out.println("employees will get 10% bonus");
        } else {
            System.out.println("employees will get 15% bonus");
        }



    }
}
