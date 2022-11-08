import java.util.Scanner;

public class Zigzag {
    public static void main(String[] args) {
        Zigzag zigzag = new Zigzag();
        zigzag.getInput();
     }
    private void getInput() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String string = scan.next();
        System.out.print("Enter Number : ");
        int num =scan.nextInt();
        findOutput(string,num);
    }
    private void findOutput(String s, int numRows) {
        int[] array = {(numRows - 1) * 2, 0};
        if(numRows==1) {
            System.out.println(s);
            return;
        }
        for (int first = 0; first < numRows; first++) {
            int next = first;
            int space = 0;
            while (next < s.length()) {
                for(int sp =0 ; sp<space;sp++)
                    System.out.print("  ");
                System.out.print(s.charAt(next)+" ");
                if (first == 0) {
                    next += array[0];
                    space = array[0]/2-1;
                    continue;
                }
                if (first == numRows - 1) {
                    next += array[1];
                    space = array[1]/2-1;
                    continue;
                }
                next += array[0];
                space = array[0]/2-1;
                if (next < s.length()) {
                    for(int sp =0;sp<space;sp++)
                        System.out.print("  ");
                    System.out.print(s.charAt(next)+" ");
                }
                next += array[1];
                space = array[1]/2-1;
            }
            array[0] -= 2;
            array[1] += 2;
            System.out.println();
        }
    }
}
