package p6.diWithXmlAndAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MeService {
    MyRepository repository ;


    public MeService( MyRepository repository) {
        this.repository = repository;
    }

    public MyRepository getRepository() {
        return repository;
    }

    public void setRepository(MyRepository repository) {
        this.repository = repository;
    }
}
