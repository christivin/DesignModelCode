package Builder;

/**
 * 一个Sender接口，两个实现类QQUser和WeChatUser
 * Created by Sheng on 2017/10/5.
 */
public class BuilderTest {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.produceQQUser(5);
        builder.produceWeChatUser(5);
    }
}
