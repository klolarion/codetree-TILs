import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(":");
        int h = Integer.parseInt(sc.next()) + 1;
        String m = sc.next(); 

        System.out.printf("%d:%s", h, m);
    }
}