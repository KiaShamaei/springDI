package s5.p08.injectPropertiseClassXml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("file:D:\\springClass\\beanDefinition\\src\\main\\java\\s5\\p08\\injectPropertiseClassXml\\config.xml");
        var bean = context.getBean(BeanWithInjcetProp.class);
        System.out.println(bean.getProperties().getProperty("jdbc.username"));

    }
}
