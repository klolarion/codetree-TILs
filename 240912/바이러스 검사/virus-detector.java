import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int restaurantCount = Integer.parseInt(bf.readLine());

        String[] arr1 = bf.readLine().split(" ");
        int[] customers = new int[arr1.length];
        for(int i = 0; i < arr1.length; i++) {
            customers[i] = Integer.parseInt(arr1[i]);
        }

        String[] arr2 = bf.readLine().split(" ");
        int teamLeader = Integer.parseInt(arr2[0]);
        int team = Integer.parseInt(arr2[1]);

        long manNeed = 0;  // 숫자가 클 수 있으므로 long 타입 사용
        for(int i = 0; i < restaurantCount; i++) {
            // 각 식당마다 팀 리더 1명 할당
            manNeed++;

            // 팀 리더를 할당하고 남은 고객 수 계산
            int remainingCustomers = customers[i] - teamLeader;

            if (remainingCustomers > 0) {
                // 추가 팀원이 몇 명 필요한지 계산
                manNeed += (remainingCustomers + team - 1) / team;
            }
        }

        bf.close();
        System.out.println(manNeed);
    }
}