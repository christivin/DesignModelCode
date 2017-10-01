package Singleton;

/**
 * Created by Sheng on 2017/10/1.
 */
public class HungryModel {
    private static HungryModel hungryModel = new HungryModel();
    private HungryModel (){};
    public HungryModel getHungryModel(){
        return hungryModel;
    }
}
