package Proxy;

/**
 * 被代理类
 * Created by Sheng on 2017/10/7.
 */
class Source implements Sourceable{
    @Override
    public void method() {
        System.out.println("原始方法!");
    }
}
