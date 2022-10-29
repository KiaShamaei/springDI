package s5.p06.customizeQualifier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        var context =new AnnotationConfigApplicationContext(Config.class);
        var bean = context.getBean(MyService.class);
        bean.getMyDao().create();
    }
}
