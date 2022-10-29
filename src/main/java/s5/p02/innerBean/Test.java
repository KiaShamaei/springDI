package s5.p02.innerBean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("file:D:\\springClass\\beanDefinition\\src\\main\\java\\s5\\p02\\innerBean\\config.xml");
        var beanThree = context.getBean(BeanThree.class);
        System.out.println("this is bean :"+beanThree.getName());
        var beanOne = context.getBean(BeanOne.class);
        beanOne.getBeanTwo().write();
    }
}
