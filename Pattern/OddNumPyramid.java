public class OddNumPyramid {

    public static void main(String[] args) {

        int i, j, k, row;
        row = 5;

        System.out.println(" Odd Number Pyramid");
        System.out.println();

        for (i=1; i<=row; i++){
            for (j=row; j>=i; j--){
                System.out.print(" ");
            }
            for (k=1; k<(i*2); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
