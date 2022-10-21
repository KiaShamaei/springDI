package p6.diWithXMLsetter;

import org.springframework.stereotype.Component;


public class MySqlRepo implements MyRepository {
    @Override
    public void crete() {
        System.out.println("this is from mysql");
    }
}
