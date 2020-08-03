public class Cross {

    public static void main(String[] args) {
        int i, j, k, row;
        row = 5;

        System.out.println("Cross");
        System.out.println();

        if (row%2==0){
            row = row + 1;
            System.out.println("Row is Even so,");
            System.out.println("increasing 1 row to loss the cross nice");
        }
        for (i=0; i<=row; i++){
            for (j=0; j<row; j++){
                if (i==j || i+j==row-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}