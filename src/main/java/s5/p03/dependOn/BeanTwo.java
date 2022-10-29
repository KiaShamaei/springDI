package s5.p03.dependOn;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BeanTwo {
    public BeanTwo() {
        System.out.println("Bean Two");
    }
    public void write(){
        System.out.println("this is  from beanTwo inner in beanOne ");
    }
}
