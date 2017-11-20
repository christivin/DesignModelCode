package Builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 建造者模式
 * 工厂类模式提供的是创建单个类的模式，而建造者模式则是将各种产品集中起来进行管理，
 * 用来创建复合对象，所谓复合对象就是指某个类具有不同的属性，
 * 其实建造者模式就是前面抽象工厂模式和最后的Test结合起来得到的。
 * Created by Sheng on 2017/10/4.
 */
public class Builder{

    private List<User> list = new ArrayList<User>();

    public void produceQQUser(int count){
        for(int i=0; i<count; i++){
            list.add(new QQUser());

        }
    }

    public void produceWeChatUser(int count){
        for(int i=0; i<count; i++){
            list.add(new WeChatUser());
        }

    }
}
