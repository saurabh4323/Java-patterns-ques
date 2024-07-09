public class reversenumdou {
  public static void main(String[] args) {
    for (int i = 0; i <4; i++) {
      for (int j = 1; j <=i; j++) {
        System.out.print(" ");
        
      }
      for (int j = i+1; j <=4; j++) {
        System.out.print(j+" ");
        
      }System.out.println();
      
    }
    for (int i = 2; i >=0; i--) {
      for (int j = 1; j <=i; j++) {
        System.out.print(" ");
        
      }
      for (int j = i+1; j <=4; j++) {
        System.out.print(j+" ");
        
      }System.out.println();
  }
  
}
}