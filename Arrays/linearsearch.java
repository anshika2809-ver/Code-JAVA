import java.util.*;
public class Arrays{


  public static int linearsearch(int number[], int key){
    
    for(int i=0;i<number.length;i++){
      if(number[i]== key){
        return i;
      }

    }
    return -1;
  }

  public static void main( String arg[]){
    int number[]={2,3,4,5,6,8,10,13,32};
    int key=10;
    int index= linearsearch(number, key);
    System.out.print(index);
  

  }
}
