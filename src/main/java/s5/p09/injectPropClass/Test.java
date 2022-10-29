package s5.p09.injectPropClass;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        var test = context.getBean(BeanOne.class);
        System.out.println(test.getUsername());
    }
}
