import com.ldy.config.SpringConfig;
import com.ldy.service.TransService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author : ldy
 * @version : 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class App1 {
    @Autowired
    private TransService transService;
    @Test
    public void t1(){
        transService.transaction("张三","李四",100.00);
    }
}
