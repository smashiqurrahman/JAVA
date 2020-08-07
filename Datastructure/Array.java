public class Array {
    public static void main(String[] args) {

        /* Array declaration 1 */
        int number[] = {1,7,5,3,10,2,6};

        /* Array declaration 2 */
        int numberOdd[] = new int[3];
        numberOdd[0] = 1;
        numberOdd[1] = 3;
        numberOdd[2] = 5;

        /* Accessing array element by index */
        System.out.println("5th element:" + number[5]);

        /* Accessing array all the elements */
        System.out.print("All the element: ");
        for (int i: number) {
            System.out.print(i + " ");
        }

        /* Array length */
        System.out.println();
        System.out.println("Length of the Array: " + number.length);

        /* Add an element to the array dynamically */
        System.out.println("Add an element");
        int size = number.length+1;
        int newNumber[] = new int[size];

        for (int i=0; i<number.length; i++ ) {
            newNumber[i] = number[i];
        }
        newNumber[newNumber.length-1] = 50;

        System.out.println("Old array length: " + number.length);
        System.out.println("Old array length: " + newNumber.length);

        System.out.println("Old Array: ");
        for (int j : number ) {
            System.out.print(j + " ");
        }

        System.out.println();
        System.out.println("New array: ");
        for (int k : newNumber ) {
            System.out.print(k + " ");
        }
    }
}
