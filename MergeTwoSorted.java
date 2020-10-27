import java.util.*;
import java.util.stream.*;
public class MergeTwoSorted
{
    // Merge arr1[0..n1-1] and arr2[0..n2-1]  
    // into arr3[0..n1+n2-1] 
    public static void mergeArrays(int[] arrayOne, int[] arrayTwo, int arrayOneLength,
                                   int arrayTwoLength, int[] arrayMerged)
    {
        int i = 0, j = 0, k = 0;

        // Generating the output which contain the merged sorted array in the descending order where each element will be printed in a separate line.
        while (i<arrayOneLength && j <arrayTwoLength)
        {
           if (arrayOne[i] > arrayTwo[j])
                arrayMerged[k++] = arrayOne[i++];
            else
               arrayMerged[k++] = arrayTwo[j++];
        }

        while(i < arrayOneLength)
            arrayMerged[k++] = arrayOne[i++];

        while (j < arrayTwoLength)
            arrayMerged[k++] = arrayTwo[j++];
    }

    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        //The first line denotes the number of elements n to be inserted in the first sorted array.
        int arrayOneLength = scan.nextInt();
        //The second line denotes the number of elements m to be inserted in the second sorted array.
        int arrayTwoLength = scan.nextInt();

        int[] arrayOne = new int[arrayOneLength];

        //The next n lines contain all the n sorted elements to be inserted in the first sorted array. Taking in reverse order for comparing in descending order.
        for (int i = arrayOneLength-1; i >= 0; i--)
            arrayOne[i] = scan.nextInt();

        int[] arrayTwo = new int[arrayTwoLength];

        //The next m lines contain all the m sorted elements to be inserted in the second sorted array. Taking in reverse order for comparing in descending order
        for (int i = arrayTwoLength-1; i >= 0; i--)
            arrayTwo[i] = scan.nextInt();

        int[] arrayMerged = new int[arrayOneLength+arrayTwoLength];

        mergeArrays(arrayOne, arrayTwo, arrayOneLength, arrayTwoLength, arrayMerged);

        // Printing the merged array
        for (int i=0; i < arrayOneLength+arrayTwoLength; i++)
            System.out.println(arrayMerged[i]);
    }
} 


