package p2.BeanDefinitionClassPath;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages ={"p2.BeanDefinitionClassPath"})
public class Config {
    @Bean("BeanThree")
    public BeanThree mybean(){
        BeanThree beanThree = new BeanThree();
        beanThree.setName("kia");
        return  beanThree ;
    }
}
