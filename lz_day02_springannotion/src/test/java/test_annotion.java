import com.lz.day02_springannotion.bean.User;
import com.lz.day02_springannotion.service.UserService;
import config.SpringConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * spring整合junit 配置
 *   导入坐标junit坐标 spring-test
 *  使用Runwith注解 它会把原有的main替换spring提供的
 *  使用ContextConfiguration告知spring运行器配置方式是注解还是xml
 *      locations 指定xml文件的位置。  加classpath 表示在类路径下
 *      classes z注解的位置
 *
 *      注意：使用spring5.x以上时。junit的jar必现要求在4.12以上
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfiguration.class)

public class test_annotion {

    @Autowired
    private UserService userService;

    @Test
    public void test01(){
//        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
//        UserService userService =  context.getBean("userService",UserService.class);

        List<User> users = userService.findAll();
        for(User user : users){
            System.out.println(user);
        }

    }
    @Test
    public void test02(){
        User user = new User();
        user.setId(7);
        user.setPassword("123");
        user.setUsername("yue");
//        userService.userMapperSave(user);
    }
}
