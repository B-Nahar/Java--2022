package feb22;

public class PramPractice {
    public static void main(String[]args){
        PramPractice ref = new PramPractice();
        ref.printName("Andrew","Ma" , "Boston");
        ref.printName("Lian","NY","Jamaica");
        ref.printName("David","MD","Baltimore");
    }
    void printName(String name,String state,String city){

        System.out.println(name);
        System.out.println(state);
        System.out.println(city);
    }
}
