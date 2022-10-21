package p3.BeanDefinitionAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanTwo {
    public BeanOne getBeanOne() {
        return beanOne;
    }

    public void setBeanOne(BeanOne beanOne) {
        this.beanOne = beanOne;
    }

    @Autowired
    private BeanOne beanOne;
    private String name ;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BeanTwo() {
    }
}
