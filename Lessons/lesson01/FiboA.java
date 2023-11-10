package gabrpavel.lesson01;
import java.math.BigInteger;

// рекурсивный способ вычисления чисел Фибоначчи

public class FiboA {

    private long startTime = System.currentTimeMillis();

    public static void main(String[] args) {

        FiboA fiboA = new FiboA();
        int n = 33;
        System.out.printf("calc(%d)=%d \n\t time=%d \n\n", n, fiboA.calc(n), fiboA.time());

        // вычисление чисел фибоначчи медленным методом (рекурсией)
        fiboA = new FiboA();
        n = 34;
        System.out.printf("slowA(%d)=%d \n\t time=%d \n\n", n, fiboA.slowA(n), fiboA.time());

    }

    private long time() {
        long result = System.currentTimeMillis() - startTime;
        startTime = System.currentTimeMillis();
        return result;
    }

    private int calc(int n) {
        // Для результата, входящего в диапазон int
        // Рекурсия, O(2^n)
        if(n == 0 || n == 1) return n;
        return calc(n - 1) + calc(n - 2);
    }

    BigInteger slowA(Integer n) {
        // Для результата, входящего в диапазон BigInteger
        // Рекурсия, O(2^n)
        if(n.equals(0)) return BigInteger.ZERO;
        if(n.equals(1)) return BigInteger.ONE;
        return slowA(n - 1).add(slowA(n - 2));
    }

}
