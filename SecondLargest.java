
public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 35};

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                second = largest;
                largest = num;
            } else if (num > second && num < largest) {
                second = num;
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("No second-largest distinct element");
        } else {
            System.out.println("Second largest = " + second);
        }
    }
}
