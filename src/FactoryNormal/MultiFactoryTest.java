package FactoryNormal;

/**
 * 多个工厂方法测试类
 * Created by Sheng on 2017/9/30.
 */
public class MultiFactoryTest {
    public static void main(String[] args) {
        MultiFactory factory = new MultiFactory();
        //生产QQ
        User sender = factory.produceQQ();
        sender.UserInfo();
        //生产WeChat
        sender = factory.produceWeChat();
        sender.UserInfo();

    }
}

