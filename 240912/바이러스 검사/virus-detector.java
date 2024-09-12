import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));;  
        
        int restaurantCount = Integer.parseInt(bf.readLine());

        String arr1[] = bf.readLine().split(" ");
        int[] customers = new int[arr1.length];
        for(int i=0; i<arr1.length; i++){
            customers[i] = Integer.parseInt(arr1[i]);
        }

        String arr2[] = bf.readLine().split(" ");
        int teamLeader = Integer.parseInt(arr2[0]);
        int team = Integer.parseInt(arr2[1]);


        int manNeed = 0;
        for(int i=0; i<restaurantCount; i++){
            
            int tmp = 0;
            tmp = customers[i] - teamLeader; 
            if(tmp<=0){
                manNeed++;
                continue;
            }
            manNeed++;
            int tmp2 = tmp/team;
            manNeed += tmp2;
            

            int plus = tmp%team;
            if(plus > 0){
                manNeed++;
            }
        }

        bf.close();
        System.out.println(manNeed);        
    }
}