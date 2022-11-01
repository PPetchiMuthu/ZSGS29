import java.util.Scanner;

public class LL {
    public static void main(String[] args) {
        LL ll = new LL();
        ll.start();
    }

    private void start() {
        Link link = new Link();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Limit : ");
        int limit = scan.nextInt();
        for (int i = 0; i < limit; i++) {
            System.out.print("Enter a element : ");
            int num = scan.nextInt();
            if (num == 2) link.addLast(num);
            else if (num == 1) link.addMid(num);
            else link.addFirst(num);
        }
        link.display();
    }
}
