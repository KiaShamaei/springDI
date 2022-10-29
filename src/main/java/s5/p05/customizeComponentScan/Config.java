package s5.p05.customizeComponentScan;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = "s5.p05.customizeComponentScan" ,
//        includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = MyAnnotation.class)
//        includeFilters = @ComponentScan.Filter(type = FilterType.ASPECTJ , pattern = "s5.p05.customizeComponentScan.*")
        includeFilters = @ComponentScan.Filter(type = FilterType.REGEX , pattern = ".*[en]")
)

public class Config {
}
