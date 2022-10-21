package p6.diWithClasspath;

public class MyOracleRepo implements MyRepository {
    @Override
    public void crete() {
        System.out.println("this is from oracle");
    }
}
