public class Heart {

    public static void main(String[] args) {

        int i, j;

        System.out.println("      Heart ");
        System.out.println();

        for (i=0; i<6; i++){
            for (j=0; j<7; j++){
                if ((i==0 && j%3!=0) || (i==1 && j%3==0) || (i-j==2) || (i+j==8)){
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}