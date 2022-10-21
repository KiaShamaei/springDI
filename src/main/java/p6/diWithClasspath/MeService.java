package p6.diWithClasspath;

public class MeService {
    MyRepository repository ;

    public MeService(MyRepository repository) {
        this.repository = repository;
    }

    public MeService() {
    }

    public MyRepository getRepository() {
        return repository;
    }

    public void setRepository(MyRepository repository) {
        this.repository = repository;
    }
}
