package s5.p02.automaticWiring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        var context = new GenericXmlApplicationContext();
        context.load("file:D:\\springClass\\beanDefinition\\src\\main\\java\\s5\\p02\\automaticWiring\\config.xml");
        context.refresh();
        var target = context.getBean("target" , Target.class);
        target.getBeanOne().write();
    }
}
