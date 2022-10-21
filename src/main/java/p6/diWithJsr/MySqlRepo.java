package p6.diWithJsr;

import javax.inject.Named;

@Named("mysql")
public class MySqlRepo implements MyRepository {
    @Override
    public void crete() {
        System.out.println("this is from mysql");
    }
}
