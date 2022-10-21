package p6.diWithJsr;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        var context =new AnnotationConfigApplicationContext(Config.class);
        MeService service = (MeService) context.getBean("service");
        service.getRepository().crete();
    }
}
