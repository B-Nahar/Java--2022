package Feb23;

public class ReturnTypeMethod {

    public static void main(String[] args){
        m1();
        System.out.println(m2());
        int i = 13;
        System.out.println(i);
        System.out.println(m3());
        System.out.println(m4()[1]);
        System.out.println(m4()[2]);
        System.out.println(m4()[0]);
    }

    static void m1(){
        int a = 5;
    }
    static String m3(){

        String c = "Name";
        return c;
    }
    static String[]m4(){
        String [] y ={"Name","Age", "Occupation"};
        return y;
    }

    static int m2(){
        int a = 5;
        return a;
    }
}
