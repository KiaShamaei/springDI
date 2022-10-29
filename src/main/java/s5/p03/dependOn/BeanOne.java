package s5.p03.dependOn;

import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
@DependsOn(value = {"beanTwo", "beanThree"})
public class BeanOne {
    public BeanTwo getBeanTwo() {
        return beanTwo;
    }

    public void setBeanTwo(BeanTwo beanTwo) {
        this.beanTwo = beanTwo;
    }

    private BeanTwo beanTwo ;

    public BeanOne() {
        System.out.println("beanOne");
    }

    public void write(){
        System.out.println("this is with automatic autowiring ...");
    }
}
