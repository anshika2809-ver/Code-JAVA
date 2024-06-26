public static int binarysearch(int n[], int key){
    int start=0;
    int end=n.length-1;
    while (start<=end) {
      int mid= (start+ end)/2;
      if(n[mid]==key){
        return mid;
      }
      if(n[mid]<key){
        start=mid+1;

      }
      else{
        end=mid-1;
      }
    }
    return -1;
  }
