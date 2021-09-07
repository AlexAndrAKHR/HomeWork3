package lesson3;

public class Method {
    public static void main(String[] args) {
        int[] myArray = {2, 4, 6, 8};
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }

        System.out.println();

        int m = myArray.length;
        int temp;

        for (int i = 0; i < m/2; i++) {
            temp = myArray[m-i-1];
            myArray[m-i-1] = myArray[i];
            myArray[i] = temp;
        }

        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }



    }
}


