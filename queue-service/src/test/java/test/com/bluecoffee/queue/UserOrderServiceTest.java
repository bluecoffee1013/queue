package test.com.bluecoffee.queue;

import com.bluecoffee.queue.constants.UserOrderState;
import com.bluecoffee.queue.domain.UserOrder;
import com.bluecoffee.queue.dto.PageResult;
import com.bluecoffee.queue.service.UserOrderService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.transaction.TransactionConfiguration;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by qianlong on 2017/7/3.
 */
public class UserOrderServiceTest extends BaseTest {

    @Autowired
    private UserOrderService userOrderService;

    @Test
    public void userApplyOrderTest(){
        try{
            for(int i=0;i<1;i++){
                UserOrder userOrder = new UserOrder();
                userOrder.setUserName("user+"+i);
                userOrder.setIdCardNumber("32891828192"+i);

                userOrderService.applyOrder(userOrder);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Test
    public void listUserOrderTest(){
        try{
            UserOrder userOrder = new UserOrder();
            userOrder.setState(UserOrderState.hasGetNo.getValue());
            userOrder.setPage(1);
            userOrder.setRows(5);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date orderDate = sdf.parse("2017-07-04 22:43:56");
            userOrder.setOrderDate(orderDate);

            PageResult<UserOrder> pageResult = userOrderService.listUserOrder(userOrder);
            Assert.assertEquals(5,pageResult.getRows().size());
            List<UserOrder> userOrderList = pageResult.getRows();
            for(UserOrder tmp:userOrderList){
                System.out.println(tmp.getIdCardNumber());
            }

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
