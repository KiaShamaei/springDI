package p4.BeanDefinitionProgramatically;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionCustomizer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
//        BeanOne beanOne = new BeanOne();
        var context = new AnnotationConfigApplicationContext(Config.class);
        context.registerBean("beanOne1" , BeanOne.class);
//        context.registerBean("beanOne", BeanOne.class, () -> beanOne, new BeanDefinitionCustomizer() {
//            @Override
//            public void customize(BeanDefinition bd) {
////                bd.setPrimary(true);
//
//            }
//        });
       var test=  context.getBean( BeanOne.class);
        System.out.println(test.getName());;
       test.writeTest();

    }
}
