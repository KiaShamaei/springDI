package p6.diWithClasspath;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Config2 {
    @Bean("sqlRepo")
    public MyRepository mySqlRepo(){
        return new MySqlRepo();
    }
    @Bean("oracleRepo")
   public MyRepository myOracleRepo(){
        return new MyOracleRepo();
    }
    //with constructor
//    @Bean
//    public MeService meService(MyRepository oracleRepo){
//        return new MeService(oracleRepo);
//    }
    //with setter
//@Bean
//public MeService meService(MyRepository oracleRepo){
//    var bean = new MeService();
//    bean.setRepository(oracleRepo);
//    return bean;
//}
    @Bean
public MeService meService(){
    var bean = new MeService();
    bean.setRepository(mySqlRepo());
    return bean;
}

}
