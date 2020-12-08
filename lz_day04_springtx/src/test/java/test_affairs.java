import com.lz.springAffairs.service.UserSevice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class test_affairs {
    @Autowired
    private UserSevice userSevice;

@Test
    public void test01(){
        userSevice.transfer("木木","林",1);
}
}
