package Feb8;

public class IncomeLevel {

    //less than 10 ==Low income
    // 10 to 20 == mid income
    // more than 20 == high income
    public static void main(String[] args){
         double income = 15.20;
         if(income<10){
             System.out.println("Low income");
         } else if (income>= 10){
             System.out.println("Mid Income");
         }else{
             System.out.println("High Income");
         }

        }




}
