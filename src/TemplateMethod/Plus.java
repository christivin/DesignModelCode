package TemplateMethod;

/**
 * 实现类
 * Created by Sheng on 2017/10/11.
 */
public class Plus extends AbstractCalculator {
    @Override
    public int calculate(int num1, int num2){
        return num1+num2;
    }
}
