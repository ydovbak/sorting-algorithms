// Fig. 19.4: BinaryArray.java2
// Class that contains an array of random integers and a method3
// that uses binary search to find an integer.4

import java.util.Random;
import java.util.Arrays;

public class BinarySearch {
    private int[] data;

    //Constructor method
    public BinarySearch(int size) {
        data = new int[size];
        Random generator = new Random();

        for (int i = 0; i < size; i++) {
            //Generating random numbers
            data[i] = 10 + generator.nextInt(99);
        }

        //Sort the array
        Arrays.sort(data);
    }

    public int binarySearch(int searchElement)
    {
        //Setting indexes
        int low = 0;
        int high = data.length-1;
        int middle = (low + high + 1)/2;
        int searchIndex = -1;

        do
        {
            //Checking middle element
            if (searchElement == data[middle])
            {
                searchIndex = middle;
            }
            else if (searchElement < data[middle])
            {
                high = middle - 1;
            }
            else
            {
                low = middle + 1;
            }

            //Recalculation of the middle
            middle = (low + high + 1)/2;

        } while ((searchIndex == -1) && (low <= high));

        return searchIndex;
    }

    public void print()
    {
        for (int el :data) {
            System.out.print(el + ", ");
        }
        System.out.println();
    }
}
