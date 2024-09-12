import java.io.*;
import java.util.*;

public class Main {
    static int restaurantCount;
    static int[] customers;
    static int teamLeader, team;

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        restaurantCount = Integer.parseInt(br.readLine());
        customers = new int[restaurantCount];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i=0; i < restaurantCount; i++) {
            customers[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        teamLeader = Integer.parseInt(st.nextToken());
        team = Integer.parseInt(st.nextToken());

        long manNeed = 0;
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

        br.close();
        System.out.println(manNeed);
    }
}