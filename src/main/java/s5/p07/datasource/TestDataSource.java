package s5.p07.datasource;

import org.springframework.beans.factory.annotation.Value;

public class TestDataSource {
    //inject with @value and config xml
    @Value("${jdbc.username}")
    private String username ;

    public String getUsername() {
        return username;
    }

}
