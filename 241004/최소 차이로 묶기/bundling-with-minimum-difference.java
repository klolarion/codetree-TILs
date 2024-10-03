import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken()); // 수열 a의 원소 개수
        int m = Integer.parseInt(st.nextToken()); // 수열 b의 원소 개수

        int[] a = new int[n];
        int[] b = new int[m];

        // 수열 a 입력
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        // 수열 b 입력
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        // 수열 a와 b 정렬
        Arrays.sort(a);
        Arrays.sort(b);

        // 두 수열에서 쌍을 만들어 차이의 합을 계산
        int minPairs = Math.min(n, m); // 만들 수 있는 최대 쌍의 개수(작은수만큼 만들 수 있음)
        int totalDifference = 0;

        for (int i = 0; i < minPairs; i++) {
            totalDifference += Math.abs(a[i] - b[i]);
        }

        // 결과 출력
        System.out.println(totalDifference);


    }
}