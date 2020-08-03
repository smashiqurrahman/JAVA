public class NumPyramid {

    public static void main(String[] args) {
        int i, j, k, row;
        row = 5;

        System.out.println("Number Pyramid");
        System.out.println();

        for (i = 1; i <= row; i++) {
            for (j = row; j >= i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                System.out.print(" " + k);
            }
            System.out.println();
        }
    }
}
