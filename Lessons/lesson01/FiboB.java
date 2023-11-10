package gabrpavel.lesson01;

import java.math.BigInteger;
import java.util.ArrayList;

/*
 * способ вычисления чисел Фибоначчи сo вспомогательным массивом
 * без ограничений на размер результата (BigInteger)
 */

public class FiboB {

    private long startTime = System.currentTimeMillis();

    public static void main(String[] args) {

        FiboB fiboB = new FiboB();
        int n = 5555;
        System.out.printf("fastB(%d)=%d \n\t time=%d \n\n", n, fiboB.fastB(n), fiboB.time());

    }

    private long time() {
        return System.currentTimeMillis() - startTime;
    }

    BigInteger fastB(Integer n) {

        BigInteger[] bigIntegers = new BigInteger[n + 1];
        bigIntegers[0] = BigInteger.ZERO;
        bigIntegers[1] = BigInteger.ONE;
        int i;
        for (i = 2; i <= n; i++)
            bigIntegers[i] = bigIntegers[i - 1].add(bigIntegers[i - 2]);
        return bigIntegers[n];
    }

}
