public class Test {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch(50);
        binarySearch.print();
        int searchElement = 45;
        int searchIndex = binarySearch.binarySearch(searchElement);
        System.out.println("Index of element " + searchElement + " is " + searchIndex);

        BubbleSort bubble = new BubbleSort(20);
        System.out.println("Bubble");
        bubble.print();
        bubble.sort();
        bubble.print();

    }
}
