// package DSA.Sorting;

public class Bubble {

    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index])
                    index = j;
            }
            int tmp = arr[index];
            arr[index] = arr[i];
            arr[i] = tmp;
        }
    }

    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int j = i - 1;
            while (j >= 0 && curr < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = curr;
        }
    }

    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }

    public static void mergeSort(int arr[], int st, int ed) {
        if (st >= ed)
            return;
        int mid = st + (ed - st) / 2; // (st + ed) / 2
        mergeSort(arr, st, mid);
        mergeSort(arr, mid + 1, ed);
        merge(arr, st, mid, ed);
    }

    public static void merge(int arr[], int st, int mid, int ed) {
        int temp[] = new int[ed - st + 1];
        int i = st;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= ed) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        // left
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // right
        while (j <= ed) {
            temp[k++] = arr[j++];
        }
        for (k = 0, i = st; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void quickSort(int arr[], int st, int ed) {
        if (st >= ed)
            return;
        // Pivot
        int pindex = partition(arr, st, ed);
        quickSort(arr, st, pindex - 1);
        quickSort(arr, pindex + 1, ed);
    }

    public static int partition(int arr[], int st, int ed) {
        int pivot = arr[ed];
        int i = st - 1;

        for (int j = st; j < ed; j++) {
            if (arr[j] <= pivot) {
                i++;
                int tmp = arr[j];
                arr[j] = arr[i];
                arr[i] = tmp;
            }
        }
        i++;
        int tmp = pivot;
        arr[ed] = arr[i];
        arr[i] = tmp;
        return i;
    }

    public static void main(String args[]) {
        // int arr[] = { 2, 3, 4, 6, 8, 1, 7, 5 };
        // int arr[] = { 1, 4, 1, 3, 2, 4, 3, 7 };
        int arr1[] = { 1, 4, 1, 3, 2 };
        int arr2[] = { 4, 3, 7 };
        int arr3[] = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length + arr2.length; i++) {
            if (i >= arr1.length) {
                arr3[i] = arr2[i - arr1.length];
            } else
                arr3[i] = arr1[i];
        }
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        // countingSort(arr);
        // mergeSort(arr3, 0, arr3.length - 1);
        quickSort(arr3, 0, arr3.length - 1);
        for (int i : arr3)
            System.out.print(i + " ");

    }
}
