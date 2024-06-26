public static int getlargest(int n[]){
  int largest= Integer.MIN_VALUE;
  for(int i=0;i<n.length;i++){
    if(largest< n[i]){
      largest=n[i];
    }
  }
  return largest;
}

public static void main(String arg[]){
  int n[]={1,2,6,8,9,10,50};
  System.out.println("Largest value is=" + getlargest(n) );
}
