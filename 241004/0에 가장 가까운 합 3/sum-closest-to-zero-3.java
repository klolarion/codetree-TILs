import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 입력 개수 받음
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt()); // 입력값을 리스트에 추가
        }

        // 리스트 정렬
        Collections.sort(list);

        // 투 포인터 초기화
        int left = 0;
        int right = list.size() - 1;
        int minSum = Integer.MAX_VALUE; // 합의 최소 절대값을 저장
        int closestSum = 0; // 가장 0에 가까운 합을 저장

        while (left < right) {
            int sum = list.get(left) + list.get(right);

            // 0에 더 가까운 합인지 확인
            if (Math.abs(sum) < Math.abs(minSum)) {
                minSum = sum;
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

        System.out.println(closestSum);
    }
}