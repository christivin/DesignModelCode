package AbstractFactory;

import AbstractFactory.QQUser;
import AbstractFactory.User;
import AbstractFactory.WeChatUser;

/**
 * 是对普通工厂方法模式的改进，
 * 在普通工厂方法模式中，
 * 如果传递的字符串出错，则不能正确创建对象，
 * 而多个工厂方法模式是提供多个工厂方法
 * Created by Sheng on 2017/9/30.
 */
public class WeChatuserFactory {
    public User produceQQ(){
        return new QQUser();
    }

    public User produceWeChat(){
        return new WeChatUser();
    }
}
