import java.util.*;

//REVERSE THE ARRAY//
public class question2{

  public static void reversearray(int arr[]){

    int start=0;
    int end=arr.length-1;

    while(start<end){

      int temp=arr[end];
      arr[end]=arr[start];
      arr[start]=temp;
      start++;
      end--;
    }
  }

  public static void main(String arg[]){

    int arr[]={3,2,1};

    reversearray(arr);
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println(" ");
  }
}
