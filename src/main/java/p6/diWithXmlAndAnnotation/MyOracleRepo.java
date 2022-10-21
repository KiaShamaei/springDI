package p6.diWithXmlAndAnnotation;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("oracle")
//@Primary

public class MyOracleRepo implements MyRepository {
    @Override
    public void crete() {
        System.out.println("this is from oracle");
    }
}
