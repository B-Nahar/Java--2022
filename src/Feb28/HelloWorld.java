package Feb28;

public class HelloWorld {

    public static void main(String[]args){
        HelloWorld name = new HelloWorld();
        System.out.println(name.printname());

    }

    String printname(){
        String name = "HelloWorld";
        return name;
    }
}
