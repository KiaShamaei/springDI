package p6.diWithJsr;

import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

@Named("service")
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
    @Inject()
    public void setRepository(@Named("oracle")
            MyRepository repository) {
        this.repository = repository;
    }
}
