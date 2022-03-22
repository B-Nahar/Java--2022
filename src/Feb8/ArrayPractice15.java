package Feb8;

public class ArrayPractice15 {
    // Jon, David, Kin
    public static void main(String [] args){
        int a = 5;
        String [] student ={ "Jon", "David", "Kin"};
        int[]marks= new int[3];
        marks[0] = 7;
        marks[1]=6;
        marks[2]=6;
        System.out.println(a);
        System.out.println(student[1]);
        System.out.println(student[2]);
        System.out.println(marks[1]);
        System.out.println(student[0]);
        for(int i=0; i<=2; i++){
            System.out.println(i);
            System.out.println(student[i]);
            System.out.println(marks[i]);
        }

    }
}
