package AdapterModel;

/**
 * Created by Sheng on 2017/10/5.
 */
public class Adapter extends Source implements Targetable {

    @Override
    public void method2(){
        System.out.println("this is the targetable method!");
    }
}
