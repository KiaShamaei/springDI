package s5.p03.dependsOn.classPath;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        var context =new AnnotationConfigApplicationContext(Config.class);
        var bean =context.getBean(BeanOne.class);

    }
}
