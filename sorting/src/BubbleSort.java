import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    private int[] data;

    //Constructor method
    public BubbleSort(int size) {
        data = new int[size];
        Random generator = new Random();

        for (int i = 0; i < size; i++) {
            //Generating random numbers
            data[i] = 10 + generator.nextInt(99);
        }
    }

    public void sort()
    {
        int length = data.length;
        for (int i = 0; i < length-1; i++)
        {
            for (int j = i+1; j < length; j++)
            {
                if(data[i] > data[j])
                {
                    swap(data, i, j);
                }
            }
            //length--;
        }
    }

    public void swap (int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void print()
    {
        for (int el :data) {
            System.out.print(el + ", ");
        }
        System.out.println();
    }
}
