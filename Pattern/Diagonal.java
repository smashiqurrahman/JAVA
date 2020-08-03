public class Diagonal {

    public static void main(String[] args) {

        int i, j, k, row;
        row = 5;

        System.out.println("Diagonal");
        System.out.println();

        for (i=1; i<=row; i++){
            for (j=1; j<=i; j++){
                if (i>=2 && j<=i-1){
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