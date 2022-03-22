package Mar9;

public class OverlodingA {

    void methodA(){

        System.out.println("methodA");
    }
    //param or Argument
    void methodA(int a, String b){
        System.out.println("methodB");
    }
    //overloading
    //different numbers of param, types of param, sequence
    void methodA(double b, String a){

    }
    void methodA(String a, int b){

    }
    void sum(){
        System.out.println("We will sum 2 numbers in this method");
    }
}
