package s5.p08.injectPropertiseClassXml;

import org.springframework.beans.factory.annotation.Value;

import java.util.Properties;

public class BeanWithInjcetProp {

    private Properties properties;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
