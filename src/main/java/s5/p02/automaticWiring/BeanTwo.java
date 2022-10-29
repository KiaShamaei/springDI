package s5.p02.automaticWiring;

import org.springframework.stereotype.Component;

@Component
public class BeanTwo {
    public BeanTwo() {
        System.out.println("Bean Two");
    }
}
