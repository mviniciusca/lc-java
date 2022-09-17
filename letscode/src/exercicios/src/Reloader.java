
public class Reloader {
    public static void main(String[] args) {

        int t = 1;
        int m = 5;
        int c = 10;

        while (t <= m) {
            c = c * (1 + t);
            t++;
        }
        System.out.println(c);
    }

}