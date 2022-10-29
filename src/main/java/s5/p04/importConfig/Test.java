package s5.p04.importConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        var co =new AnnotationConfigApplicationContext(ConfigParent.class);
        var listOfBeans = co.getBeanDefinitionNames();
        Arrays.stream(listOfBeans).filter(x->x.toLowerCase().startsWith("bean")).
                forEach(System.out::println);
    }
}
