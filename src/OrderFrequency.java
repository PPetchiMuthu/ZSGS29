import java.util.*;

public class OrderFrequency {
    public static void main(String[] args) {
        OrderFrequency orderFrequency = new OrderFrequency();
        orderFrequency.getInput();
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
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : array)
            map.put(num, map.getOrDefault(num, 0) + 1);
        int size = map.size();
       int index =0;
        for(int i=0;i<size;i++) {
            int num = findKey(map);                           //2 3 2 4 5 12 2 3 3 3 12
            for(int j=0;j< map.get(num);j++) {                //0 2 1 -1 1 2 0 4 -1 4
                array[index++] = num;
            }
           map.remove(num);
        }
        System.out.println(Arrays.toString(array));
    }

    private int findKey(Map<Integer, Integer> map) {
        int key = 0;
        int val = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > val) {
                key = entry.getKey();
                val = entry.getValue();
            }else if(val == entry.getValue()){
                if(entry.getKey()<key){
                    key = entry.getKey();
                    val = entry.getValue();
                }
            }
        }
        return key;
    }
}
