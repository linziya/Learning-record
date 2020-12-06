package config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * 与spring配置文件作用相同的类
 *
 * 注解
 * Configuration 当前类为配置类  当配置类作为AnnotationConfigApplicationContext（xxx.class）
 * 对象创建的参数时。可以不写 参数中填该类的字节码
 *
 * ComponentScan spring创建容器时需要扫描的包
 *      value属性 指定容器扫描那个包 basePackages 与value二选一均可
 *
 * Bean 吧当前方法作为范围和存到ioc容器中
 *  属性name 用于指定bean 的id  不写时，默认值是当前方法的名称 写时 name = “xxx”
 *
 *  当使用注解配置时。如果有方法参数，spring回去容器中查找可用的bean对象  查找方式与Autowired方式相容
 *
 * import  导入其他配置类
 *  value属性 指定其他类的字节码 使用有import的类为父配置类。被引入的为子类
 */
@Configuration
@ComponentScan("com.lz.day02_springannotion")
//import（xxxx.class）
@PropertySource("classpath:jdbc.properties")
public class SpringConfiguration {

    @Value("${jdbc.driverClassName}")
    private String driver;

    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;

    @Bean
    public QueryRunner createQueryRunner(DataSource dataSource){
        return new QueryRunner(dataSource);
    }

    /**
     * c创建数据源对象
     * @return
     */
    @Bean(name = "dateSource")
    public DataSource createDateSource(){

        try{
            ComboPooledDataSource dataSource = new ComboPooledDataSource();
            dataSource.setDriverClass(driver);
            dataSource.setJdbcUrl(url);
            dataSource.setUser(username);
            dataSource.setPassword(password);

            return  dataSource;

        }catch (Exception e){
            throw  new RuntimeException(e);
        }


    }
}
