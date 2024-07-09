public class hristargap {
    public static void main(String[] args) {
        int i, j, k;
        int n = 6;

        for (i = 1; i <= n; i++) { //// ye tera outeer loop hogya

            for (j = i; j < n; j++) { /// sbse pehle hum isme distance lenge aur oah space hona chahiye
                System.out.print("  ");
            }

            for (k = 1; k <= (2 * i - 1); k++) { // ek aur lkoop chalta ehai ye bhi inner hoga bade wale mae

                if (k == 1 || k == (2 * i - 1) || i == n) { // iska logic na smjh aaye mae aaye toh raat ko smjha dunga
                                                            // likhne mae bhut lgegea question mast tha thnx
                    System.out.print(" *");
                }

                else {
                    System.out.print("  ");
                }
            }

            System.out.println("");
        }
    }
}
