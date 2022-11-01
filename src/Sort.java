import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Sort sort = new Sort();
        sort.getInput();
    }

    private void getInput() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int limit = scan.nextInt();
        int[] array = new int[limit];
        System.out.println("Enter the " + limit + " values");
        for (int i = 0; i < limit; i++)
            array[i] = scan.nextInt();
        findOutput(array);
    }

    private void findOutput(int[] array) {
        int end = array.length % 2 == 0 ? array.length - 1 : array.length - 2;
        sortEven(end, array);
        sortOdd(array.length - 1, array);
        System.out.println(Arrays.toString(array));
    }

    private void sortOdd(int end, int[] array) {
        for (int i = 0; i <= end - 2; i = i + 2) {                   //10 7 1 -1 4 -10 6 15 21
            for (int j = i + 2; j <= end; j = j + 2) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    private void sortEven(int end, int[] array) {
        for (int i = 1; i <= end - 2; i = i + 2) {
            for (int j = i + 2; j <= end; j = j + 2) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

            }
        }
    }
}
