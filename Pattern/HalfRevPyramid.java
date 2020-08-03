public class HalfRevPyramid {

    public static void main(String[] args) {
        int i, j, k, row;
        row = 5;

        System.out.println("Half Reverse Pyramid");
        System.out.println();

        for (i=0; i<=row; i++){
            for (j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
