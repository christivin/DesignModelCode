package Singleton;

/**
 * 静态内部类
 * Created by Sheng on 2017/10/4.
 */
public class StaticInnerClass {
    private static class InnerClasss{
        private static final StaticInnerClass instance=new StaticInnerClass();
    }
    private StaticInnerClass(){}
    public static final StaticInnerClass getInstance(){
        return InnerClasss.instance;
    }
}
