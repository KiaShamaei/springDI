package p6.diWithXmlAndAnnotation;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        var context =new  GenericXmlApplicationContext();
        context.load("file:D:\\springClass\\beanDefinition\\src\\main\\java\\p6\\diWithXmlAndAnnotation\\config.xml");
        context.refresh();
        MeService service = (MeService) context.getBean("meService");
        service.getRepository().crete();
    }
}
