package p2.BeanDefinitionClassPath;

import org.springframework.stereotype.Component;

@Component
public class BeanOne {
    private String name ;

    public BeanOne() {
    }
    public void write(){
        System.out.println("this is write something");
    }

    public BeanOne(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
