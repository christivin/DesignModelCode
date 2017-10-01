package Singleton;

/**
 * 和饿汉模式差不多，都是在类初始化即实例化instance。
 * Created by Sheng on 2017/10/1.
 */
public class HungryModelStaticBlock {
    private static HungryModelStaticBlock instance = null;//在静态块只能访问被static修饰的成员
    static {
        instance= new HungryModelStaticBlock();
    }
    private HungryModelStaticBlock(){}
    public HungryModelStaticBlock getInstance(){
        return this.instance;   //不能在static修饰的函数中使用this
    }
}
