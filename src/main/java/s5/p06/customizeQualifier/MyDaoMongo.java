package s5.p06.customizeQualifier;

import org.springframework.stereotype.Component;

@Component
@DataBaseType(value = "mongo" , type = "nosql")
public class MyDaoMongo implements Dao{
    @Override
    public void create() {
        System.out.println("this is from mongo ...");
    }
}
