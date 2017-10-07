package Proxy;

/**
 * Created by Sheng on 2017/10/7.
 */
class Source implements Sourceable{
    @Override
    public void method() {
        System.out.println("the original method!");
    }
}
