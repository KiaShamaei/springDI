package p5.BeanSingleTon;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        var context = new GenericXmlApplicationContext("file:D:\\springClass\\beanDefinition\\src\\main\\java\\p5\\BeanSingleTon\\config.xml");

    }
}
