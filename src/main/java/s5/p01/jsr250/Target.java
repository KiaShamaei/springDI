package s5.p01.jsr250;


import javax.annotation.Resource;
import javax.inject.Named;

@Named
public class Target {
    private BeanOne beanOne;

    public BeanOne getBeanOne() {
        return beanOne;
    }


    @Resource(name = "beanOne")
    public void setBeanOne(BeanOne beanOne) {
        this.beanOne = beanOne;
    }
}
