package Mar9;

public class ArrayIssue {

    public static void main(String [] args){

        int []nums ={3,16,78,29,54};

        System.out.println(nums[3]);

          try{

              Thread.sleep(3000);
              System.out.println(nums[2]);
              System.out.println(nums[1]);
              System.out.println(nums[0]);

          }catch (Exception e){

          }

        System.out.println("printed");


    }
}
