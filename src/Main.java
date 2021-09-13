import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.println();
        System.out.println("*******************************");
        System.out.println();


        /*
         * A
         * B B
         * C C C
         * D D D D
         * */

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (i + 64) + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("*******************************");
        System.out.println();


        /*
         * A
         * A B C
         * A B C D
         * A B C D E
         * */

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (j + 64) + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("*******************************");
        System.out.println();

        /*
         * F
         * F E
         * F E D
         * F E D C
         * F E D C B
         * F E D C B A
         * */

        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((char) ((rows - j) + 64) + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("*******************************");
        System.out.println();

        /*
        * A B C D
        * A B C
        * A B
        * A*/

        for (int i = 0; i <= rows; i++) {
            for (int j = 1; j <= (rows-i); j++) {
                System.out.print((char) (j + 64) + " ");
            }
            System.out.println();
        }

    }

}
