package s5.p07.datasource.withAnnotation;


import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "s5.p07.datasource.withAnnotation")
@PropertySource("file:D:\\springClass\\beanDefinition\\src\\main\\java\\s5\\p07\\datasource\\withAnnotation\\datasource.properties")
public class DataSourceConfig {
    @Value("${jdbc.username}")
    private String username ;
    @Value("${jdbc.password}")
    private String password ;
    @Value("${jdbc.url}")
    private String url ;

    @Bean
    public DataSource dataSource(){
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }

}
