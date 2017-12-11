package Proxy;

/**
 * 其实每个模式名称就表明了该模式的作用，代理模式就是多一个代理类出来，替原对象进行一些操作，
 * 比如我们在租房子的时候回去找中介，为什么呢？因为你对该地区房屋的信息掌握的不够全面，
 * 希望找一个更熟悉的人去帮你做，此处的代理就是这个意思。
 * 再如我们有的时候打官司，我们需要请律师，因为律师在法律方面有专长，可以替我们进行操作，表达我们的想法
 * Created by Sheng on 2017/10/7.
 */
interface Sourceable {
     
     void method();//接口中的方法默认为public的，实现接口中定义的方法时，必须定义为public
                   // 否则它们将只能得到默认的包访问权限，这样在方法被继承的过程中可访问权限降低，是不允许的
}
