package p6.diWithXMLsetter;

import org.springframework.stereotype.Component;

@Component
public class MeService {
    MyRepository repository ;

    public MeService() {
    }

    public MeService(MyRepository repository) {
        this.repository = repository;
    }

    public MyRepository getRepository() {
        return repository;
    }

    public void setRepository(MyRepository repository) {
        this.repository = repository;
    }
}
