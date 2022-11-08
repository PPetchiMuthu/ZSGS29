import java.util.*;

public class BufferedProblem {
    public static void main(String[] args) {
        BufferedProblem bufferedProblem = new BufferedProblem();
        bufferedProblem.getInput();
    }

    private void getInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Number of packets : ");
        int limit = scan.nextInt();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < limit; i++) {
            String str = scan.nextLine();
            list.add(str);
        }
        getStart(list);
    }

    private void getStart(List<String> list) {
        Map<Integer,String> buffer = new HashMap<>();
        int index = 1;
        for(String str:list){
            int start = str.indexOf('-');
            for(int i =0 ;i< str.length();i++){
//                if(i==0||i>i)
            }
        }
    }


}
