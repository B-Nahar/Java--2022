package Feb23;

public class MethodParts {

    public static void main(String []args){

        MethodParts ref = new MethodParts();
        ref.m1();
        ref.m2();
        ref.m3();
        ref.m4();

    }
    public void m1(){
        System.out.println("metod m1 and public");
    }
    protected void m2(){
        System.out.println("metod m1 and  protected");
    }
    void m3(){
        System.out.println("metod m1 and  default");
    }

    private void m4(){
        System.out.println("metod m1 and   private");
    }
}
