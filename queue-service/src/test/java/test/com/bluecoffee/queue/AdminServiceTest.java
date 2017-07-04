package test.com.bluecoffee.queue;

import com.bluecoffee.queue.dto.BaseResult;
import com.bluecoffee.queue.service.SysAdminService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by qianlong on 2017/7/3.
 */
public class AdminServiceTest extends BaseTest{

    @Autowired
    private SysAdminService adminService;

    @Test
    public void adminLoginTest(){
        try{
            BaseResult result = adminService.adminLogin("admin","123");
            System.out.println(result);
        }catch (Exception ex){
            ex.printStackTrace();

        }
    }
}
