package Mar08;

public class OverloadingPrac {
    public static void main(String[]args){
// Overloding
        OverloadingPrac ov = new OverloadingPrac();
        ov.methodA(56, "");
    }
    void methodA(){
        System.out.println("Print A");
    }
    void methodA(String a){
        System.out.println("A2" + a);
    }
    void methodA(int a){
        System.out.println("A3");
    }

    void methodA(String a, int b){
        System.out.println("A4");
    }
    void methodA(int a, String b){
        System.out.println("A5");
    }
}
