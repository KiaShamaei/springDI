package s5.p07.datasource.withAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestClassDataSource {
    public static void main(String[] args) throws SQLException {
        var context = new AnnotationConfigApplicationContext(DataSourceConfig.class);
        DataSource datasource =  context.getBean("dataSource" , DataSource.class);
        System.out.println(datasource);
        Connection connection = datasource.getConnection();
        var statement = connection.prepareStatement("select * from employee");
        ResultSet data = statement.executeQuery();

        while (data.next()){
            System.out.println(data.getString("name"));
        }
    }
}
