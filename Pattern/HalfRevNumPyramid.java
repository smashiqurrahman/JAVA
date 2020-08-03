public class HalfRevNumPyramid {

    public static void main(String[] args) {

        int i, j, k, row;
        row = 5;

        System.out.println("Half Reverse Number Pyramid");

        for (i=0; i<=row; i++){
            for (j=1; j<i; j++){
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }
}
