import java.util.Random;

public class SelectionSort {
    int[] elements;

    public SelectionSort (int size)
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
        // algorithm selects the smallest element in the array,
        // then inserts it into the start of the array
        int size = elements.length;
        int smallestIndex;
        for (int i = 0; i < elements.length-1; i++)
        {
            smallestIndex = i;
            for (int j = i+1; j < size; j++)
            {
                if (elements[smallestIndex] > elements[j])
                {
                    smallestIndex = j;
                }
            }
            swap(elements, i, smallestIndex);
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
