public class SortingMethods {

    // Bubble Sort O(n^2)
    public void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printArray(arr);
    }


    //Selection Sort O(n^2)
    public void selectionSort(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            int smallest = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }
            //swap
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        printArray(arr);
    }


    // Insertion Sort  O(n^2)
    public void insertionSort(int[] arr) {
        for(int i=1; i<arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > current) {
                //Keep swapping
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }

        printArray(arr);
    }



    // Merged Sort O(nlogn) ====>  divide O(logn) ||| coonquer ===> O(n)

    public void mergedSort(int arr[]){
        divide(arr, 0, arr.length - 1);
        printArray(arr);
    }
    public void divide(int arr[], int start, int end){
        if(start >= end){
            return;
        }

        int mid = start + (end - start)/2;              //(si + ei) / 2;

        divide(arr, start, mid);
        divide(arr, mid+1, end);

        conquer(arr, start , mid, end);
    }
    public void conquer(int arr[], int start, int mid, int end){
        int []merged = new int[end - start + 1];

        int index1 = start;
        int index2 = mid + 1;
        int x = 0;

        while(index1 <= mid && index2 <= end ){
            if(arr[index1] <= arr[index2]){
                merged[x] = arr[index1];
                x++;
                index1++;
            }
            else{
                merged[x] = arr[index2];
                x++;
                index2++;
            }
        }
        while(index1 <= mid){
            merged[x++] = arr[index1++];
        }
        while(index2 <= end){
            merged[x++] = arr[index2++];
        }
        for(int i = 0, j = start; i< merged.length; i++,j++){
            arr[j] = merged[i];
        }
    }

    // Quick Sort
    // worst case : O(n^2)  ==>occurs when pivot is always the smallest or largest element
    // average : O(nlogn)
    public void quickSort(int arr[]){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        quickSortImpl(arr, low, high);

        printArray(arr);
    }

    private void quickSortImpl(int[] arr, int low, int high) {
        if(low < high){
            int pivotIndex = partition(arr, low ,high);

            quickSortImpl(arr, low, pivotIndex - 1);
            quickSortImpl(arr, pivotIndex + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {

            int pivot = arr[high];
            int i = low -1;

            for (int j = low; j < high; j++) {
                if (arr[j] < pivot){
                    i++;
                    // swap i and j elem
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            //swap pivot to its original position after sort
            i++;
            int temp = arr[i];
            arr[i] = arr[high];
            arr[high] = temp;
            return i;
    }


    // Method to print array
    private static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}







/*

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // Pointer for nums1
        int j = n - 1; // Pointer for nums2
        int k = m + n - 1; // Pointer for the merged array

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // Copy any remaining elements from nums2 to nums1
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
        */
