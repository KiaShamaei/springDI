package p3.BeanDefinitionAnnotation.componentScan;


import org.springframework.context.support.GenericXmlApplicationContext;


public class TestWithComponentScan {
    public static void main(String[] args) {
        var context = new GenericXmlApplicationContext("file:D:\\springClass\\beanDefinition\\src\\main\\java\\p3\\BeanDefinitionAnnotation\\componentScan\\configAnnotaitionWithXmlComponentScan.xml");
        BeanTwo beanTwo = context.getBean(BeanTwo.class);
        beanTwo.getBeanOne().writTets();
    }
}
