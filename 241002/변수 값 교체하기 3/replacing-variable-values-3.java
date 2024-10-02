public class Main {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int tmp = 0;

        tmp = a;
        a = b;
        b = a;

        System.out.println(a);
        System.out.println(b);
    
    }
}