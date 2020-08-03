public class DiamondHalf {

    public static void main(String[] args) {

        int i, j, k, row;
        row = 5;

        System.out.println("Half Diamond");
        System.out.println();

        for (i=1; i<=row; i++){
            for (j=row; j>=i; j--){
                System.out.print(" ");
            }
            for (k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (i=1; i<=row; i++){
            for (j=0; j<=i; j++){
                System.out.print(" ");
            }
            for (k=row-1; k>=i; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
