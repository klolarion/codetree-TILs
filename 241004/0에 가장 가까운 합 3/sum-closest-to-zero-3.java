import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        while(sc.hasNext()){
            list.add(sc.nextInt());
        }



        int result = 0;
        int min = Integer.MAX_VALUE;
        
        for(int i=0; i<list.size(); i++){
            int a = list.get(i);
            
            for(int j=1; j<list.size(); j++){
                int b = list.get(j);
                result = Math.abs(a+b);
                if(result < Math.abs(min)){
                    min = a+b;
                }
            
            }
        }

        System.out.println(min);
    }
}