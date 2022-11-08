import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PushSeven {
    public static void main(String[] args) {
        PushSeven pushSeven = new PushSeven();
        pushSeven.getInput();
    }
    private void getInput() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int limit = scan.nextInt();
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter the " + limit + " values");
        for (int i = 0; i < limit; i++)
            list.add(scan.nextInt());
        System.out.println(list);
        findOutput(list);
    }

    private void findOutput(List<Integer> list) {      //1 9 8 4 7 7 2 0 7 6 7
        int size = list.size();
        int count = 0;
        for(int i=0;i<size;i++)
            if(list.get(i) == 7) {
                list.add(7);
                count++;
            }
        for(int i=0;i<count;i++)
                list.remove((Integer) 7);
        System.out.println(list);
    }
}
