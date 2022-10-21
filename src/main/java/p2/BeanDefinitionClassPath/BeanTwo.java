package p2.BeanDefinitionClassPath;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "BeanTwo")
public class BeanTwo {
    @Autowired
    private BeanOne beanOne;

    public BeanOne getBeanOne() {
        return beanOne;
    }

    public void setBeanOne(BeanOne beanOne) {
        this.beanOne = beanOne;
    }
}
