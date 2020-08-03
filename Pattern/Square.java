public class Square {
    public static void main(String[] args) {
        int i, j, k, row;
        row = 5;

        System.out.println("Square");
        System.out.println();

        for (i=1; i<=row; i++){
            for (j=1; j<=row; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
