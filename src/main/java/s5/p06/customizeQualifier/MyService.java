package s5.p06.customizeQualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyService {
    public Dao getMyDao() {
        return myDao;
    }

    private Dao myDao;
@Autowired
@DataBaseType(value = "mysql" , type = "sql")
    public void setMyDao(Dao myDao) {
        this.myDao = myDao;
    }

}
