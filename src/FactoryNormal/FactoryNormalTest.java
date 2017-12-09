package FactoryNormal;

/**
 * 普通工厂方法
 * 包含一个公共接口User
 * 两个实现类QQUser和WeChatUser
 * 一个工厂类：用于生产QQUser和WeChatUser
 * Created by Sheng on 2017/9/29.
 */
public class FactoryNormalTest {
    public static void main(String[] args){
        //生成工厂
        UserFactory userFactory = new UserFactory();
        //生成QQ用户
        User user = userFactory.produce("QQ");
        user.UserInfo();
        //当user重新加载WeChat后上面工厂生成的QQ用户可能会被垃圾回收
        user = userFactory.produce("WeChat");
        user.UserInfo();

    }
}
