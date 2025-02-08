import java.util.Scanner;

class rot_array_search {
    public static void main(String[] args) {
        int arr[] = {4, 5, 7, 0, 1, 2};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Target element : ");
        int target = sc.nextInt();
        System.out.println("The target element " + target + " is at index " + search(arr, target));
        sc.close();
    }

    static int search(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2; // Correct mid calculation

            if (arr[mid] == target) {
                return mid;
            }

            // Determine which part of the array is sorted
            if (arr[left] <= arr[mid]) { // Left part is sorted
                if (arr[left] <= target && target < arr[mid]) {
                    right = mid - 1; // Search in the left sorted part
                } else {
                    left = mid + 1; // Search in the right unsorted part
                }
            } else { // Right part is sorted
                if (arr[mid] < target && target <= arr[right]) {
                    left = mid + 1; // Search in the right sorted part
                } else {
                    right = mid - 1; // Search in the left unsorted part
                }
            }
        }

        return -1; // Target not found
    }
}
