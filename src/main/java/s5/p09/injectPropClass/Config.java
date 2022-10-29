package s5.p09.injectPropClass;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "s5.p09.injectPropClass")
@PropertySource("file:D:\\springClass\\beanDefinition\\src\\main\\java\\s5\\p09\\injectPropClass\\data.properties")
public class Config {
}
