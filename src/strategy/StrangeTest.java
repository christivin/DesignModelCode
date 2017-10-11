package strategy;

/**
 * 简单的测试类
 * Created by Sheng on 2017/10/10.
 */
public class StrangeTest {
    public static void main(String[] args){
        String exp = "2*8";
        ICalculator cal = new Multiply();
        int result = cal.calculate(exp);

        System.out.println(result);
    }
}
