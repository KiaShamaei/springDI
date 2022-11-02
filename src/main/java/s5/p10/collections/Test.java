package s5.p10.collections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
//        var context = new ClassPathXmlApplicationContext("file:D:\\springClass\\beanDefinition\\src\\main\\java\\s5\\p10\\collections\\config.xml");
        var context = new ClassPathXmlApplicationContext("file:D:\\springClass\\beanDefinition\\src\\main\\java\\s5\\p10\\collections\\configWithUtil.xml");
        var beanCollection = context.getBean(CollectionImportXmlUtil.class);
        beanCollection.displayinfo();
    }
}
