public class trianglespacestar {
  public static void main(String[] args) {
    // for (int i = 5; i >=0; i--) {
    //   for (int j = 1; j <= i; j++) {
    //     System.out.print(" ");
        
    //   }for (int j = 1; j <=6-i; j++) {
    //     System.out.print("* ");
        
    //   }System.out.println();
      
    // }

    for (int i = 0; i < 6; i++) {
      for (int j = 6-i; j >=1 ; j--) {
        System.out.print(" ");
        
      }
      for (int j = 1; j <=i; j++) {
        System.out.print("* ");
        
      }System.out.println();
      
    }
    }
  }
  

