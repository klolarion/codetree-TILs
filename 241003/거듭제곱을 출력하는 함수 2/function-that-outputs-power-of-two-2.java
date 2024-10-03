import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int x = (int)Math.pow(a, b);
        int y = (int)Math.pow(b, a);

        if(x < y){
            System.out.println(y - x);
        }else{
              System.out.println(x - y);
        }
      
    }

}