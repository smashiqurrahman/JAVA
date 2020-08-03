public class RevPyramid {

    public static void main(String[] args) {

        int i, j, k, row;
        row = 5;

        System.out.println("Reverse Pyramid");
        System.out.println();

        for (i=1; i<=row; i++){
            for (j=1; j<=i; j++){
                System.out.print(" ");
            }
            for (k=row; k>=i; k--){
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}
