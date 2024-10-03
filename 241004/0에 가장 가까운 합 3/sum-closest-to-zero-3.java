import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 입력 첫 줄에서 숫자의 개수 받기
        int n = Integer.parseInt(br.readLine());
        
        
         // 입력 데이터를 한 줄로 받아서 공백으로 분리
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] list = new int[n]; // 고정 크기의 배열 사용
        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }



        int result = 0;
        int min = Integer.MAX_VALUE;
        
        for(int i=0; i<list.length; i++){
            int a = list[i];
            
            for(int j=1; j<list.length; j++){
                int b = list[j];
                result = Math.abs(a+b);
                if(result < Math.abs(min)){
                    min = a+b;
                }
            
            }
        }

        System.out.println(min);
    }
}