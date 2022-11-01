import java.util.*;

public class OrderByFrequency {
    public static void main(String[] args) {
        OrderByFrequency orderByFrequency = new OrderByFrequency();
        orderByFrequency.getInput();
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
        int index =0;
        List<Integer> list = new ArrayList<>();
        List<Integer> frequency = new ArrayList<>();
        for(int i=0;i<array.length-1;i++) {
            int count = 1;
            if (array[i] != Integer.MAX_VALUE) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        count++;
                        array[j] = Integer.MAX_VALUE;
                    }
                }
                list.add(array[i]);
                frequency.add(count);
            }
        }
        for(int i=0;i<list.size();i++) {
            int num = getMax(frequency);
            for(int j=0;j< frequency.get(num);j++) {
                array[index++] = list.get(num);
            }
            frequency.set(num,0);
        }
        System.out.println(Arrays.toString(array));
    }
    private int getMax(List<Integer> frequency) {
        int index = 0;
        int max =frequency.get(0);
        for(int i=1;i<frequency.size();i++)
            if(max<frequency.get(i)) {
                max = frequency.get(i);
                index = i;
            }
        return index;
    }
}
