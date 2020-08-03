public class DiamondEmptyInside {

    public static void main(String[] args) {

        int i, j, k, row;
        row = 5;

        System.out.println("Diamond Empty Inside");
        System.out.println();

        for (i=1; i<=row; i++){
            for (j=row; j>=i; j--){
                System.out.print(" ");
            }
            for (k=1; k<(i*2); k++){
                if (k>1 && k<(i*2)-1){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        i = j = k = 0;

        for (i=row; i>=1; i--){
            for (j=row+1; j>i; j--){
                System.out.print(" ");
            }
            for (k=1; k<(i*2); k++){
                if (k>1 && k<(i*2)-1){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
