package Singleton;

/**
 * 这种写法lazy loading很明显，但是致命的是在多线程不能正常工作。
 * Created by Sheng on 2017/10/1.
 */

public class LazyModel_unSafe {
    private static LazyModel_unSafe instance;
    private LazyModel_unSafe (){}

    public static LazyModel_unSafe getInstance() {
        if (instance == null) {
            instance = new LazyModel_unSafe();
        }
        return instance;
    }
}