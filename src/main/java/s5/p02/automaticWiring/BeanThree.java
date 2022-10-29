package s5.p02.automaticWiring;

import org.springframework.stereotype.Component;

@Component
public class BeanThree {
    public BeanThree() {
        System.out.println("Bean Three");
    }
}
