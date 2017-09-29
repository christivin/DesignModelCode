package FactoryNormal;

/**
 * Created by Sheng on 2017/9/29.
 */
public class UserFactory  {
    public User produce(String type){
        if(type=="WeChat")
        {
            return new WeChatUser();
        }
        if(type=="QQ")
        {
            return new QQUser();
        }
        else
        {
            System.out.println("仅限输入QQ或WeChat");
            return null;
        }
    }
}
