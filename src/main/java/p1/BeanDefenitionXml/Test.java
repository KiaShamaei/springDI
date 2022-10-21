package p1.BeanDefenitionXml;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        var context = new GenericXmlApplicationContext("file:D:\\springClass\\beanDefinition\\src\\main\\java\\p1\\BeanDefenitionXml\\configS1.xml");
       context.refresh();
        var bean = context.getBean("beanOneS1");
        System.out.println(bean);
    }
}
