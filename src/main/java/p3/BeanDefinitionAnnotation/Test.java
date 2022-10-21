package p3.BeanDefinitionAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("file:D:\\springClass\\beanDefinition\\src\\main\\java\\p3\\BeanDefinitionAnnotation\\configAnnotaitionWithXml.xml");
       BeanTwo bean =  context.getBean(BeanTwo.class);
       bean.getBeanOne().writTets();
    }
}
