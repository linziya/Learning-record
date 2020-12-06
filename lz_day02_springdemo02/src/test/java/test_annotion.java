import com.lz.day02_springdemo.bean.User;
import com.lz.day02_springdemo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


public class test_annotion {

    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) context.getBean("userService");

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
