import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-");
        String m = sc.next();
        String d = sc.next();
        String y = sc.next();

        System.out.printf("%s.%s.%s", y,m,d);
    }
}