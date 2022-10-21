package p3.BeanDefinitionAnnotation.componentScan;

import org.springframework.stereotype.Component;

@Component
public class BeanOne {
    private String name ;

    public BeanOne() {
    }
    public void  writTets(){
        System.out.println("test bean one ...");
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
