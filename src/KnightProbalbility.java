import java.util.Scanner;

public class KnightProbalbility {
    public int knightProbability(int n, int k, int row, int column) {
        int[] one = {-1, 1};
        int[] two = {-2, 2};
        int first = 0, second = 0;
        int countPossibility = 0;
        if (k == 0) return 1;
        while (first != 2) {
            if (((row + one[first]) >= 0 && (column + two[second]) >= 0) && ((row + one[first]) < n && (column + two[second]) < n)) {
                countPossibility += knightProbability(n, k - 1, one[first] + row, two[second] + column);
            }
            if (((row + two[first]) >= 0 && (column + one[second]) >= 0) && ((row + two[first]) < n && (column + one[second]) < n)) {
                countPossibility += knightProbability(n, k - 1, two[first] + row, one[second] + column);
            }
            second++;
            if (second == 2) {
                first++;
                second = 0;
            }
        }
        return countPossibility;
    }

    public static void main(String[] args) {
        KnightProbalbility knight = new KnightProbalbility();
        knight.getInput();
    }

    private void getInput() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = scan.nextInt();
        System.out.print("No of moves : ");
        int k = scan.nextInt();
        System.out.print("Row : ");
        int row = scan.nextInt();
        System.out.print("Column : ");
        int column = scan.nextInt();
        int pos = knightProbability(n, k, row, column);
        double d = pos / Math.pow(8, k);
        System.out.println(d);
    }
}
