package Singleton;

/**
 * 双重校验锁
 * 有人说双重校验没意义
 的确在jdk1.5之前是没意义
 但在jdk的里程碑版本1.5之后就变得很有意义  而且现在以及被广泛使用  因为引入了修饰符volatile
 这也是为什么说jdk1.5才能使用双重校验
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
