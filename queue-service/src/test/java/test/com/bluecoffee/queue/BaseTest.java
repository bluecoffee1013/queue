package test.com.bluecoffee.queue;

import com.bluecoffee.queue.Application;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by qianlong on 2017/7/3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@SpringBootTest(classes = Application.class)
public class BaseTest {
}
