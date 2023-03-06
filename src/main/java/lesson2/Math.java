package lesson2;

public class Math {
    public static long fact(int n){
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static char sign(int n){
        return (n < 0) ? '-' : '+';
    }
}
