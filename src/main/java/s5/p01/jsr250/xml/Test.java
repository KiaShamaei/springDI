package s5.p01.jsr250.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        var context =new ClassPathXmlApplicationContext("file:D:\\springClass\\beanDefinition\\src\\main\\java\\s5\\p03\\dependOn\\xml\\config.xml");
        context.getBean(BeanOne.class);
    }
}
