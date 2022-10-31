class Bubble {
  public static void bubbleSort(int a[]) {
    for(int i=0; i<a.length; i++) {
      for(int j=0; j<a.length-i-1; j++) {
        if(a[j] > a[j+1]) {
          int temp = a[j];
          a[j] = a[j+1];
          a[j+1] = temp;
        }
      }
    }
  }

  public static void main(String[] args) {
    int a[] = {4, 8, 1, 3, 10, 9, 2, 11, 5, 6};
    bubbleSort(a);

    //printing array
    for(int i=0; i<10; i++) {
      System.out.print(a[i] + " ");
    }
    System.out.println("");
  }
}
