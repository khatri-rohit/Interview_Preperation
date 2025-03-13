// package DSA.Search;

public class BinarySearch {

    public static int search(int arr[], int target, int st, int ed) {
        if (st > ed) {
            return -1;
        }

        int mid = st + (ed - st) / 2;

        if (arr[mid] == target)
            return mid;

        if (arr[st] <= arr[mid]) {
            if (arr[st] <= target && target <= arr[mid]) {
                return search(arr, target, st, mid - 1);
            } else
                return search(arr, target, mid + 1, ed);
        } else {
            if (arr[mid] <= target && target <= arr[ed]) {
                return search(arr, target, mid + 1, ed);
            } else
                return search(arr, target, st, mid - 1);
        }
    }

    public static int binarySearch(int arr[], int tar) {
        int st = 0, ed = arr.length - 1;
        while (st <= ed) {
            int mid = st + (ed - st) / 2;
            if (arr[mid] == tar) {
                return mid;
            }
            if (tar < arr[mid]) {
                ed = mid - 1;
            }
            if (tar > arr[mid]) {
                st = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        // int arr[] = { 0, 1, 2, 4, 5, 6, 7, };
        int target = 1;
        // System.out.println(search(arr, target, 0, arr.length - 1));
        System.out.println(binarySearch(arr, target));
    }
}
