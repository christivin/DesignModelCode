package TemplateMethod;

/**
 * 首先将exp和"\\+"做参数，调用AbstractCalculator类里的calculate(String,String)方法，
 * 在calculate(String,String)里调用同类的split()，之后再调用calculate(int ,int)方法，
 * 从这个方法进入到子类中，执行完return num1 + num2后，将值返回到AbstractCalculator类，赋给result，打印出来。
 * Created by Sheng on 2017/10/11.
 */
public class TemplateMethodTest {
    public static void main(String[] args) {
        String exp = "8+8";
        AbstractCalculator cal = new Plus();
        int result = cal.calculate(exp, "\\+");
        System.out.println(result);
    }

}
