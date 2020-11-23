public class Test {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch(50);
        int searchElement = 45;
        int searchIndex = binarySearch.binarySearch(searchElement);
        System.out.println("Index of element " + searchElement + " is " + searchIndex);
    }
}
