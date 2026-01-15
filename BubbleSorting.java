
// In this type of sorting two, two elements are compared till end and if first element is 
// greater it will be swapped and at the end of first iteration last elem will be sorted elem.
public class BubbleSorting {
    // Print array
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 9, 3, 7, 11, 1, 4, 2 };
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) { // After each outer loop, the largest unsorted element moves to the end
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) { // inner loop will compare and swap
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
        print(arr);
    }
}
