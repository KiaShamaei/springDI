package p6.diWithClasspath;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public MeService meService(){
        return new MeService(repo2());
    }
    @Bean
    public MyOracleRepo repo1(){
        return new MyOracleRepo();
    }
    @Bean
    public MySqlRepo repo2(){
        return new MySqlRepo();
    }
}
