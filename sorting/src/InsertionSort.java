import java.util.Random;

public class InsertionSort {
    int[] elements;

    public InsertionSort (int size)
    {
        elements = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++)
        {
            elements[i] = random.nextInt(100);
        }
    }

    public void sort()
    {
        // algorithm selects loops thought the elements and inserts
        // each  element into its correct position in already sorted
        // part of the array

        for (int i = 1; i < elements.length; i++)
        {

                for(int j = i; j > 0; j--)
                {
                    if (elements[j] < elements[j-1]) {
                        swap(elements, i, i-1);
                    }
                }
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
        for (int el :elements) {
            System.out.print(el + ", ");
        }
        System.out.println();
    }
}
