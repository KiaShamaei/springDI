package p6.diWithXmlAndAnnotation;

import org.springframework.stereotype.Component;

@Component("mysql")
public class MySqlRepo implements MyRepository {
    @Override
    public void crete() {
        System.out.println("this is from mysql");
    }
}
