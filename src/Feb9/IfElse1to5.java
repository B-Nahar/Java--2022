package Feb9;

public class IfElse1to5 {

    public static void main(String []args){

        int a = 3;
        if(a==1){
            System.out.println("one");
        }
        else if(a==2){
            System.out.println("two");
        } else if(a==3){
            System.out.println("Three");
        }
        else if(a==4){
            System.out.println("Four");
        }
        else if(a==5){
            System.out.println("Five");
        }

        else {
            System.out.println("wrong input");
        }
        int b = 3;
        switch (b){
            case 1:

                System.out.println("one");
                break;
            case 2:

                System.out.println("two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Wrong Input");
        }
    }
}
