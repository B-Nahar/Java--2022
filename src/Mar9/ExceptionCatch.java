package Mar9;

public class ExceptionCatch {


    public static void main(String []args){

        int []nums ={3,16,78,29,54};

        try{ System.out.println(nums[2]);}
        catch(Exception e){
            System.out.println("We got exception");
        }


    }

}
