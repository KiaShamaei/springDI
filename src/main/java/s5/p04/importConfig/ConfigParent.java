package s5.p04.importConfig;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import(ConfigChild.class)
@ImportResource("file:D:\\springClass\\beanDefinition\\src\\main\\java\\s5\\p04\\importConfig\\config.xml")
public class ConfigParent {
    @Bean
    public BeanThree beanThree(){
        return new BeanThree();
    }

}
