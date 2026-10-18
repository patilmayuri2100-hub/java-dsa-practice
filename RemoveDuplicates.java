
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {10, 10, 20, 20, 30, 40, 40};

        int j = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

        for (int i = 0; i <= j; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
