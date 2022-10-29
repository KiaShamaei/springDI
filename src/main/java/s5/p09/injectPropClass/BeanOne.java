package s5.p09.injectPropClass;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BeanOne {
    @Value("${user.username}")
    private String username;

    public String getUsername() {
        return username;
    }
}
