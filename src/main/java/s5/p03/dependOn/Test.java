package s5.p03.dependOn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("file:D:\\springClass\\beanDefinition\\src\\main\\java\\s5\\p03\\dependOn\\config.xml");
        var t = context.getBean(BeanOne.class);
        t.write();

    }
}
