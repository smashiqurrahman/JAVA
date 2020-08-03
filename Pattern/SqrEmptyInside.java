public class SqrEmptyInside {

    public static void main(String[] args) {

        int i, j, row;
        row = 5;

        System.out.println("Square Empty Inside");
        System.out.println();

        for (i = 1; i <= row; i++) {
            for (j = 1; j <= row; j++) {
                if (i >= 2 && j >= 2 && i <= row - 1 && j <= row - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
