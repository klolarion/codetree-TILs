import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken()); // 수열 a의 원소 개수
        int m = Integer.parseInt(st.nextToken()); // 수열 b의 원소 개수

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        // 수열 a 입력
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a.add(Integer.parseInt(st.nextToken()));
        }

        // 수열 b 입력
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            b.add(Integer.parseInt(st.nextToken()));
        }

        // 수열 a와 b 정렬
        Collections.sort(a);
        Collections.sort(b);

        // 두 수열에서 쌍을 만들어 차이의 합을 계산
        int minPairs = Math.min(n, m); // 만들 수 있는 최대 쌍의 개수(작은수만큼 만들 수 있음)
        int totalDifference = 0;

        for (int i = 0; i < a.size(); i++) {
            int tmp = Integer.MAX_VALUE;
            int low_j = 0;
            for(int j = 0; j< b.size(); j++){
                if(Math.abs(a.get(i) - b.get(i)) < tmp){
                    tmp = Math.abs(a.get(i) - b.get(i));
                    System.out.println(tmp);
                    low_j = j;
                }
            }
            a.remove(i);
            b.remove(low_j);
            totalDifference += tmp;
            
        }

        // 결과 출력
        System.out.println(totalDifference);


    }
}