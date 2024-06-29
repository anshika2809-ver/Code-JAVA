import java.util.*;


//MAXIMUM AND MINIMUM ELEMENT IN ARRAY....//

public class question1 {

  public static int minimum(int arr[]){
    int min=Integer.MAX_VALUE;
    int n=arr.length;

    for(int i=0;i<n;i++){
      if(arr[i]<min){
        min=arr[i];
      }
    }
    return min;
  }

  public static int maximum(int arr[]){
    int max=Integer.MIN_VALUE;
    int n=arr.length;

    for(int i=0;i<n;i++){
      if(arr[i]>max){
        max=arr[i];
      }
    }
    return max;
  }


  public static void main(String[] args) {
    int arr[]={3,5,4,1,9};
    System.out.print("minimum number is=" + minimum(arr));
    System.out.println(" ");
    System.out.print("maximum number is=" + maximum(arr));

  }

  
}
