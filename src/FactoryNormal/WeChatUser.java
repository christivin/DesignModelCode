package FactoryNormal;

/**
 * Created by Sheng on 2017/9/29.
 */

public class WeChatUser implements User{
    @Override
    public void UserInfo(){
        System.out.println("我是微信用户！");
    }
}