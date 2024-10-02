import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\.");
        String y = sc.next();
        String m = sc.next();
        String d = sc.next();

        System.out.printf("%s-%s-%s", m, d, y);
    }
}