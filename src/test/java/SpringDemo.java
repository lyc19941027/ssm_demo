import com.test.ssm_demo.model.User;
import com.test.ssm_demo.service.UserService;
import com.test.ssm_demo.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: yinc.luo
 * @date: 2018-08-24 0:16
 */
public class SpringDemo {

    @Test
    public void test(){
        SpringDemo demo =new SpringDemo();
        demo.testSpring();
    }
    public void testSpring(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("E:\\Java\\IdeaProjects\\ssm_demo\\target\\ssm_demo-0.0.1-SNAPSHOT\\WEB-INF\\classes\\applicationContext.xml");
        UserService userService=(UserServiceImpl) ctx.getBean("UserServiceImpl");
        System.out.println(userService.getAll());


    }
}
