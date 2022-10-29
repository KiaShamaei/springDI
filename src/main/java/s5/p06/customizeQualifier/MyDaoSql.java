package s5.p06.customizeQualifier;

import org.springframework.stereotype.Component;

@Component
@DataBaseType(value = "mysql" , type = "sql")
public class MyDaoSql  implements Dao{
    public void create(){
        System.out.println("this from my dao");
    }
}
