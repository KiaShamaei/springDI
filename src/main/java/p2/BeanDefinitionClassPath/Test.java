package p2.BeanDefinitionClassPath;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
       var two =(BeanTwo)context.getBean("BeanTwo");
       var three =  context.getBean("BeanThree" , BeanThree.class);
        System.out.println(three.getName());
        two.getBeanOne().write();
    }
}
