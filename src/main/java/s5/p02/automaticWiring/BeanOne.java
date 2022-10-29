package s5.p02.automaticWiring;


import org.springframework.stereotype.Component;

@Component
public class BeanOne {
    public BeanOne() {
        System.out.println("beanOne");
    }
    public void write(){
        System.out.println("this is with automatic autowiring ...");
    }
}
