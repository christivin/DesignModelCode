package Singleton;

/**
 *  这种写法能够在多线程中很好的工作，而且看起来它也具备很好的lazy loading，
 *  效率很低，99%情况下不需要同步。
 *  而且线程也不是绝对安全，因为instance = new LazyModel_Safe();此句并不是原子操作
 * Created by Sheng on 2017/10/1.
 */
public class LazyModel_Safe {
    private static LazyModel_Safe instance;
    private LazyModel_Safe (){}
    public static synchronized LazyModel_Safe getInstance() {
        if (instance == null) {
            instance = new LazyModel_Safe();
        }
        return instance;
    }
}