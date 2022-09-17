
public class Reloader {
    public static void main(String[] args) {

        int t = 1;
        int m = 5;
        int c = 10;
        c = c * (1 + t);

        while (t < m) {
            t++;
            c = c * (1 + t);
        }
        System.out.println(c);
    }

}