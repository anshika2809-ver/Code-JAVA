import java.util.*;

public class SumOfEvenandOdd{

  public static void main(String arg[] ){
    Scanner Sc = new Scanner(System.in);

    int num; 
    int choice;
    int evensum=0;
    int oddsum=0;
    do{
      System.out.print("Enter the number= ");
      num= Sc.nextInt();

      if(num%2==0){
        evensum+= num;
      }
      else{
        oddsum+= num;
      }
      System.out.println("do you continue? press 1 for yes ,0 for no ");
      choice =Sc.nextInt(); 
      
    }while(choice==1);

    System.out.println("evensum is =" + evensum);
    System.out.println("oddsum is =" + oddsum);

  }
}
