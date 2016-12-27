import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: xueyuan
 * Date: 2016/12/20 0020
 * Time: 20:47
 */

public class Java8New {

    @Test
    public void testJava8Lambad() {
        MathMethod add = (a, b, c) -> a + b + c;

        System.out.println(" 10 - 5  = " + add.sumA_B(10, 5, 5));


    }

    interface MathMethod {
        //int addA_B(int a, int b);

        int sumA_B(int a, int b, int c);
    }
}
