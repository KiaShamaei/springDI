package s5.p04.importConfig;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigChild {
    @Bean
    public BeanTwo beanTwo(){
        return new BeanTwo();
    }
}
