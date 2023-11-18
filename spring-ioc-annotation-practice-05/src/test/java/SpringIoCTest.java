import com.lihanlin.controller.StudentController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIoCTest {
    @Test
    public void test1(){
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("spring.xml");
     StudentController bean = applicationContext.getBean(StudentController.class);
        bean.findAll();
    }
}
