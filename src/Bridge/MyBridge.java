package Bridge;

/**
 * Created by Sheng on 2017/10/9.
 */
public class MyBridge extends Bridge {
    public void method(){
        getSource().method();
    }
}
