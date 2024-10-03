import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 입력 첫 줄에서 숫자의 개수 받기
        int n = Integer.parseInt(br.readLine());
        
        // 입력 데이터를 한 줄로 받아서 공백으로 분리
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] arr = new int[n]; // 정수 배열 생성
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 배열 정렬
        Arrays.sort(arr);

        // 투 포인터 초기화
        int left = 0;
        int right = n - 1;
        int closestSum = arr[left] + arr[right]; // 초기 두 값의 합으로 시작

        while (left < right) {
            int sum = arr[left] + arr[right];

            // 0에 더 가까운 합인지 확인
            if (Math.abs(sum) < Math.abs(closestSum)) {
                closestSum = sum;
            } else if (Math.abs(sum) == Math.abs(closestSum) && sum < closestSum) {
                closestSum = sum;
            }

            // 합이 0보다 크면 right를 왼쪽으로 이동
            if (sum > 0) {
                right--;
            } 
            // 합이 0보다 작으면 left를 오른쪽으로 이동
            else if (sum < 0) {
                left++;
            } 
            // 합이 정확히 0이면 그 자체가 최소값이므로 종료
            else {
                break;
            }
        }

        // 결과 출력
        System.out.println(closestSum);
    }
}