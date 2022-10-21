package p6.diWithXMLsetter;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        var context =new  GenericXmlApplicationContext();
        context.load("file:D:\\springClass\\beanDefinition\\src\\main\\java\\p6\\diWithXMLsetter\\config.xml");
        context.refresh();
        MeService service = (MeService) context.getBean("myservice");
        service.getRepository().crete();
    }
}
