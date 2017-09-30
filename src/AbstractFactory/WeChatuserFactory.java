package AbstractFactory;

import AbstractFactory.QQUser;
import AbstractFactory.User;
import AbstractFactory.WeChatUser;

/**
 * 抽象工厂的实现类
 * WeChat工厂类
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
