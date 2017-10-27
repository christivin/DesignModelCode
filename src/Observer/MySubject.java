package Observer;

/**
 * 对象
 * Created by Sheng on 2017/10/11.
 */
public class MySubject extends AbstractSubject{
    @Override
    public void operation(){
        System.out.println("update myself");
        notifyObservers();

    }
}
