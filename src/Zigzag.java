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
    private void findOutput(String str, int num) {
        int[] array = {(num - 1) * 2, 0};
        if(num==1) {
            System.out.println(str);
            return;
        }
        for (int first = 0; first < num; first++) {
            int next = first;
            int space = 0;
            while (next < str.length()) {
                for(int sp =0 ; sp<space;sp++)
                    System.out.print("  ");
                System.out.print(str.charAt(next)+" ");
                if (first == 0) {
                    next += array[0];
                    space = array[0]/2-1;
                    continue;
                }
                if (first == num - 1) {
                    next += array[1];
                    space = array[1]/2-1;
                    continue;
                }
                next += array[0];
                space = array[0]/2-1;
                if (next < str.length()) {
                    for(int sp =0;sp<space;sp++)
                        System.out.print("  ");
                    System.out.print(str.charAt(next)+" ");
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
