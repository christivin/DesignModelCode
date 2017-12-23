package Proxy;

/**
 * Created by Sheng on 2017/10/7.
 */
class Proxy implements Sourceable{
    private Source source;
    public Proxy(){
        super();
        this.source=new Source();
    }
    @Override
    public void method(){
        before();
        source.method();
        after();
    }
    private void before(){
        System.out.println("之前");
    }

    private void after(){
        System.out.println("之后");
    }

}
