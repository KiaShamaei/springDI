package p6.diWithJsr;

import javax.inject.Named;

@Named("oracle")
public class MyOracleRepo implements MyRepository {
    @Override
    public void crete() {
        System.out.println("this is from oracle");
    }
}
