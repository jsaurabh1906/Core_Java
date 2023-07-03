// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int arr[] = {70 , 58, 11, 93, 22, 8, 1, 99, 5};
        SortingMethods sort = new SortingMethods();
        //sort.bubbleSort(arr);
        //sort.selectionSort(arr);
        sort.insertionSort(arr);

    }
}