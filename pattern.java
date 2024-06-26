import java.util.*;
 
public class pattern{

  // square
  public static void square( int n){

    for(int i=1;i<=n;i++){
      for(int j=1;j<=n;j++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  // hollow square
  public static void Hollowsquare( int n){
    for(int i=1;i<=n;i++){
      for(int j=1;j<=n;j++){
        if(i==1||i==n||j==1||j==n){
          System.out.print("* ");
        }
        else{
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }

  //right halft pyramid star

  public static void righthalfstars(int n){

    for (int i=1;i<=n;i++){
      for (int j=1;j<=n;j++){
        if(i>=j){
          System.out.print("* ");

        }
      }
      System.out.println();
    }
  }

  public static void righthalfnum(int n){
    

    for (int i=1;i<=n;i++){
      for (int j=1;j<=n;j++){
        if(i>=j){
        if((i+j)%2==0){
          System.out.print(1 +" ");
        }
        else{
          System.out.print(0 +" ");
        }
      }
      }
      System.out.println();
    }
    
  }

  public static void topleft(int n){

    for(int i=1;i<=n;i++){
      for(int j=1;j<=n;j++){
        if((i+j)<=n+1){
          System.out.print("* ");
        }
      }
      System.out.println();
    }

  }

  public static void bottomright(int n){

    for(int i=1;i<=n;i++){
      for(int j=1;j<=n;j++){
        if((i+j)>=n+1){
          System.out.print("*");
        }
        else{
          System.out.print(" ");
      
        }
      }
      System.out.println();
    }

    // for(int i=1;i<=n;i++){
    //   for(int j=1;j<=n-i;j++){
    //     System.out.print(" ");
    //   }
    //   for(int j=1;j<=i;j++){
    //     System.out.print("*");
    //   }
    //   System.out.println();

    // }

  }

  public static void topright(int n){
    for(int i=1;i<=n;i++){
      for(int j=1;j<=n;j++){
        if((j-i)>=0){
          System.out.print("*");
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }





  public static void xpattern(int n){
    for(int i=1;i<=n;i++){
      for(int j=1;j<=n;j++){
        if((j-i)==0||(i+j)==n+1){
          System.out.print("*");
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }


  public static void rhombus(int n){
    for(int i=1;i<=n;i++){
      for(int j=1;j<=(n-i);j++){
        System.out.print(" ");
      }
      for(int j=1;j<=n;j++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  public static void hollowrhombus(int n){
    for(int i=1;i<=n;i++){
      for(int j=1;j<=(n-i);j++){
        System.out.print(" ");
      }
      for(int j=1;j<=n;j++){
        if(i==1||i==n||j==1||j==n){
          System.out.print("*");
        }
        else{
      System.out.print(" ");
        }
      }
      System.out.println();
    }
  }


  public static void diamand(int n){
    for(int i=1;i<=n;i++){
      for(int j=1;j<=(n-i);j++){
        System.out.print(" ");
      }
      for(int j=1;j<=(2*i-1);j++){
        System.out.print("*");
      }
      System.out.println();
    }

    for(int i=n-1;i>=1;i--){
      for(int j=1;j<=(n-i);j++){
        System.out.print(" ");
      }
      for(int j=1;j<=(2*i-1);j++){
        System.out.print("*");
      }
      System.out.println();

    }
  }


  public static void hollowdiamond(int n){
    for(int i=1;i<=n;i++){
      for(int j=1;j<=(n-i);j++){
        System.out.print(" ");
      }
      
      for(int k=1;k<=(2*i-1);k++){
        
        if(k==1||k==2*i-1){
          System.out.print("*");
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println();    
    }


    for(int i=n-1;i>=1;i--){
      for(int j=1;j<=(n-i);j++){
        System.out.print(" ");
      }
      
      for(int k=1;k<=(2*i-1);k++){
        
        if(k==1||k==2*i-1){
          System.out.print("*");
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println();
      
    }
  }




  public static void butterfly(int n){
    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        System.out.print("*");
      }
      for(int j=1;j<=2*(n-i);j++){
        System.out.print(" ");
      }
      for(int j=1;j<=i;j++){
        System.out.print("*");
      }
      System.out.println();
    }

    for(int i=n-1;i>=1;i--){
      for(int j=1;j<=i;j++){
        System.out.print("*");
      }
      for(int j=1;j<=2*(n-i);j++){
        System.out.print(" ");
      }
      for(int j=1;j<=i;j++){
        System.out.print("*");
      }
      System.out.println();
    }

  }
  public static void main (String arg[]){
    //square(5);
    //Hollowsquare(5);
    //righthalfstars(5);
    //righthalfnum(5);
    //topleft(5);
    //bottomright(5);
    //topright(5);
    //xpattern(5);
    //rhombus(5);
    //hollowrhombus(5);
    //diamand(3);
    //hollowdiamond(5);
    //butterfly(4);

  }
}
