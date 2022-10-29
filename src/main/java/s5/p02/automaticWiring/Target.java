package s5.p02.automaticWiring;

import org.springframework.stereotype.Component;


public class Target {
    private BeanOne beanOne;
    private BeanTwo beanTwo ;
    private BeanThree beanThree;

    public BeanOne getBeanOne() {
        return beanOne;
    }

    public void setBeanOne(BeanOne beanOne) {
        this.beanOne = beanOne;
    }

    public BeanTwo getBeanTwo() {
        return beanTwo;
    }

    public void setBeanTwo(BeanTwo beanTwo) {
        this.beanTwo = beanTwo;
    }

    public BeanThree getBeanThree() {
        return beanThree;
    }

    public void setBeanThree(BeanThree beanThree) {
        this.beanThree = beanThree;
    }
}
