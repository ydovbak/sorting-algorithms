public class Test {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch(50);
        binarySearch.print();
        int searchElement = 45;
        int searchIndex = binarySearch.binarySearch(searchElement);
        System.out.println("Index of element " + searchElement + " is " + searchIndex);

        BubbleSort bubble = new BubbleSort(20);
        System.out.println("\nBubble");
        bubble.print();
        bubble.sort();
        bubble.print();

        SelectionSort selection = new SelectionSort(20);
        System.out.println("\nSelection");
        selection.print();
        selection.sort();
        selection.print();

        InsertionSort insertin = new InsertionSort(20);
        System.out.println("\nInsertion");
        insertin.print();
        insertin.sort();
        insertin.print();

    }
}
