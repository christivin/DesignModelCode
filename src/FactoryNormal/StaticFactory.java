package FactoryNormal;

/**
 * 将多个工厂方法模式里的方法置为静态的，
 * 不需要创建实例，直接调用即可。
 * Created by Sheng on 2017/9/30.
 */
public class StaticFactory {
    public static User produceQQ(){
        return new QQUser();
    }

    public static User produceWeChat(){
        return new WeChatUser();
    }
}