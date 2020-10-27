import java.io.*;
import java.util.*;


class ArrayListExample {
    public static void main(String[] args)
    {
        // Size of the
        // ArrayList
        int n = 6;

        // Declaring the ArrayList with
        // initial size n
        ArrayList<Integer> arrli
                = new ArrayList<Integer>(n);

        // Appending new elements at
        // the end of the list
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter array list numbers:");
        for (int i = 1; i <= n; i++)
            arrli.add(scan.nextInt());

        // Printing 3rd element element (index is 2)
        System.out.print( arrli.get(2)+" ");

        // Replace the 5th element from the beginning with integer 8 (index of 5th element is 4)
        arrli.set(4,8);

        //Print the 5th element from the beginning
        System.out.print( arrli.get(4)+" ");

        //Print the index of the element 56
        System.out.print( arrli.indexOf(56)+" ");

        //Add the element 44 at index 2
        arrli.add(2,44);

        //Print the 5th element from the beginning
        System.out.print( arrli.get(4)+" ");

        //Remove the element at index 1
        arrli.remove(1);

        // Print the index of the element 9
        System.out.print(arrli.indexOf(9));
    }
}
