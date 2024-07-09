public class butterfly {
  public static void main(String[] args) {                       //  //
      for (int i = 1; i <= 7; i++) {
          
          for (int j = 1; j <= i; j++) {
              System.out.print("*");
          }

          for (int j = 1; j <= 14 - (2 * i); j++) {
              System.out.print(" ");
          }
          for (int j = 1; j <= i; j++) {
              System.out.print("*");
          }

          System.out.println();
      }
      for (int i = 7; i >=0; i--) {
          
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }

        for (int j = 1; j <= 14 - (2 * i); j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }

        System.out.println();
    }
  }
}

    
