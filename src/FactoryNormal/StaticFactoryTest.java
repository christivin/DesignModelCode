package FactoryNormal;
/**
 * 静态工厂方法测试类
 * Created by Sheng on 2017/9/30.
 */
public class StaticFactoryTest {
    public static void main(String[] args) {
        //生产QQ
        User sender = StaticFactory.produceQQ();
        sender.UserInfo();
        //生产WeChat
        sender = StaticFactory.produceWeChat();
        sender.UserInfo();
    }
}
