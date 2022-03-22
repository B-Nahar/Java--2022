package Mar9;

public class ToytaCar implements Car{
    @Override
    public void moves() {
        System.out.println("moves fast upto 150mph");
    }

    @Override
    public void stops() {
        System.out.println("stops  when break is pressed");

    }

    @Override
    public void engry() {

    }

    @Override
    public void control() {

    }
    void  safety(){
        System.out.println("airbags, ai accident detectio");
    }
    void backCamera(){
        System.out.println("for convenient parking");
    }
}
