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

        //Printing the array
        System.out.println( printArray(low, high));

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


    public String printArray(int low, int high)
    {
        StringBuilder temporary = new StringBuilder();

        // output spaces for alignment
        for (int i = 0; i < low; i++)
            temporary.append(" ");

        // output elements left in array
        for (int i = low; i <= high; i++)
            temporary.append(data[i] + " ");

        temporary.append("\n");
        return temporary.toString();
    } // end method remainingElements


}
