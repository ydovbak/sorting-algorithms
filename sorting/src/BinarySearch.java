// Fig. 19.4: BinaryArray.java2
// Class that contains an array of random integers and a method3
// that uses binary search to find an integer.4
import java.util.Random;
import java.util.Arrays;

public class BinarySearch
{
    private int [] data;

    //Constructor method
    public BinarySearch(int size)
    {
        data = new int[size];
        Random generator = new Random();

        for (int n : data)
        {
            //Generating random numbers
            n = 10 + generator.nextInt(99);
        }

        //Sort the array

    }


}
