package Decorator;



/**
 * Created by Sheng on 2017/10/6.
 */
public class Source implements Sourceable {

    @Override
    public void method() {
        System.out.println("the original method!");
    }
}