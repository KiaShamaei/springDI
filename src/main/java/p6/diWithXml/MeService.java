package p6.diWithXml;

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
