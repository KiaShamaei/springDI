package p6.diWithClasspath;

public class MySqlRepo implements MyRepository {
    @Override
    public void crete() {
        System.out.println("this is from mysql");
    }
}
