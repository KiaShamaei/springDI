package s5.p01.jsr250;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    //for use jsr 250 first add dependency javax-annotation 1.3.2
    public static void main(String[] args) {
        var context =  new AnnotationConfigApplicationContext(Config.class);
        var target =context.getBean("target" , Target.class);
        target.getBeanOne().write();

    }
}
