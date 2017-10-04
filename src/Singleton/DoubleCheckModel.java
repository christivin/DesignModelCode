package Singleton;

/**
 * 双重校验锁
 * Created by Sheng on 2017/10/4.
 */
public class DoubleCheckModel {
    private static volatile DoubleCheckModel intance;
    private DoubleCheckModel(){}
    public DoubleCheckModel getInstance(){
        if(intance==null) {
            synchronized (DoubleCheckModel.class) {
                if (intance == null)
                    intance = new DoubleCheckModel();
            }
        }
            return intance;
    }
}
