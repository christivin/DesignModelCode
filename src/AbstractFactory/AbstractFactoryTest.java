package AbstractFactory;

/**
 * Created by Sheng on 2017/9/30.
 */
public class AbstractFactoryTest {
    public static void main(String[] args){
        Provider provider = new QQuserFactory();
        User user = provider.produce();
        user.UserInfo();
    }
}
