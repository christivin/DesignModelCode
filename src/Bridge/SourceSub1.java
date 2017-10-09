package Bridge;

/**
 * Created by Sheng on 2017/10/9.
 */
public class SourceSub1 implements Sourceable
{
    @Override
    public void method() {
        System.out.println("this is the first sub!");
    }
}
