package s5.p07.datasource;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws SQLException {
        var context = new ClassPathXmlApplicationContext("file:D:\\springClass\\beanDefinition\\src\\main\\java\\s5\\p07\\datasource\\config.xml");
       DataSource datasource =  context.getBean("datasource" , DataSource.class);
        Connection connection = datasource.getConnection();
        var statement = connection.prepareStatement("select * from employee");
        ResultSet data = statement.executeQuery();

        while (data.next()){
            System.out.println(data.getString("name"));
        }
        System.out.println(datasource);
        var test = context.getBean(TestDataSource.class);
        System.out.println(test.getUsername());
    }
}
